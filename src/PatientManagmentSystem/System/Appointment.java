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
public class Appointment {
    private String Doctor_ID;
    private String Patient_ID;
    private String Dates;

    public Appointment() {
    }

    public Appointment(String Doctor_ID, String Patient_ID, String Dates) {
        this.Doctor_ID = Doctor_ID;
        this.Patient_ID = Patient_ID;
        this.Dates = Dates;
    }

    public String getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(String Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
    }

    public String getPatient_ID() {
        return Patient_ID;
    }

    public void setPatient_ID(String Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    public String getDates() {
        return Dates;
    }

    public void setDates(String Dates) {
        this.Dates = Dates;
    }
    
    
      public static void DeleteAppointmentRequest(String SelectedUser) throws IOException
        {
            String tempFile = "temp.txt";
            File oldFile = new File("RequestAppointment.txt");
            File newFile = new File(tempFile);
            
            String DoctorID = "Error"; String PatientID = "Error"; String Date = "Error"; 
            
            
             try  {
                 FileWriter writer = new FileWriter(tempFile, false);
                 BufferedWriter bwrite = new BufferedWriter(writer);
                 PrintWriter pwrite = new PrintWriter(bwrite);
                 
                 
                 FileReader fread = new FileReader("RequestAppointment.txt");
                 BufferedReader bread = new BufferedReader(fread);
           
              
                 while ((DoctorID = bread.readLine()) != null) { 
                
                 PatientID = bread.readLine();
                 Date = bread.readLine();
             
            
                 if(!PatientID.equals(SelectedUser))
                 {
                      writer.write(DoctorID);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(PatientID);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(Date);
                      writer.write(System.getProperty("line.separator"));                                           
                    }
                 }
                 fread.close();
                 pwrite.flush();
                 pwrite.close();
                 oldFile.delete();
                 File dump = new File("RequestAppointment.txt");
                 newFile.renameTo(dump);}
             
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null, "Error" + e);
             }
        }
    
    
}
