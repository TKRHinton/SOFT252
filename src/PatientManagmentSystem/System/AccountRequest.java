/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

import PatientManagmentSystem.Users.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Theon
 */
public class AccountRequest {
    private String PatientName;
    private String PatientAddress;

    /**
     *
     */
    public AccountRequest() {
    }

    /**
     *
     * @param PatientName
     * @param PatientAddress
     */
    public AccountRequest(String PatientName, String PatientAddress) {
        this.PatientName = PatientName;
        this.PatientAddress = PatientAddress;
    }

    /**
     *
     * @return
     */
    public String getPatientName() {
        return PatientName;
    }

    /**
     *
     * @param PatientName
     */
    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    /**
     *
     * @return
     */
    public String getPatientAddress() {
        return PatientAddress;
    }

    /**
     *
     * @param PatientAddress
     */
    public void setPatientAddress(String PatientAddress) {
        this.PatientAddress = PatientAddress;
    }
    
    /**
     *
     * @param SelectedUser
     * @throws IOException
     */
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
         
    /**
     *
     * @param Request
     * @throws IOException
     */
    public static void newAccountRequest (User Request) throws IOException
     {
           try (FileWriter writer = new FileWriter("AccountRequest.txt", true)) {
          //  writer.write(System.getProperty("line.separator"));
            writer.write(Request.getName() );
            writer.write(System.getProperty("line.separator"));
            writer.write(Request.getAddress());
             writer.close();
           }}
           
    /**
     *
     * @return
     */
    public static ArrayList<AccountRequest> readAccountRequest()
     {
           ArrayList<AccountRequest> newRequest = new ArrayList<>();
             
          try
        {
            FileReader fread = new FileReader("AccountRequest.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String name = "1";

            while ((name = bread.readLine()) != null) {
                String  Address = bread.readLine();
                
                
                AccountRequest user = new AccountRequest(name,Address);
                newRequest.add(user);                
            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newRequest);  }
    
    
}
