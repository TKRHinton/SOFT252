/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Theon
 */
public class AccountRequest {
    private String PatientName;
    private String PatientAddress;

    public AccountRequest() {
    }

    public AccountRequest(String PatientName, String PatientAddress) {
        this.PatientName = PatientName;
        this.PatientAddress = PatientAddress;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientAddress() {
        return PatientAddress;
    }

    public void setPatientAddress(String PatientAddress) {
        this.PatientAddress = PatientAddress;
    }
    
    
    
    
      
        
         public static void DeleteAccountRequest(String SelectedUser) throws IOException
        {
            String tempFile = "temp.txt";
            File oldFile = new File("AccountRequest.txt");
            File newFile = new File(tempFile);
            
            String PatientName = "Error"; String PatientAddress = "Error"; 
            
            
             try  {
                 FileWriter writer = new FileWriter(tempFile, false);
                 BufferedWriter bwrite = new BufferedWriter(writer);
                 PrintWriter pwrite = new PrintWriter(bwrite);
                 
                 
                 FileReader fread = new FileReader("AccountRequest.txt");
                 BufferedReader bread = new BufferedReader(fread);
           
              
                 while ((PatientName = bread.readLine()) != null) { 
                
                 PatientAddress = bread.readLine();
             
            
                 if(!PatientName.equals(SelectedUser))
                 {
                      writer.write(PatientName);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(PatientAddress);
                      writer.write(System.getProperty("line.separator"));
                                                    
                    }
                 }
                 fread.close();
                 pwrite.flush();
                 pwrite.close();
                 oldFile.delete();
                 File dump = new File("AccountRequest.txt");
                 newFile.renameTo(dump);}
             
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null, "Error" + e);
             }
        }
    
    
}
