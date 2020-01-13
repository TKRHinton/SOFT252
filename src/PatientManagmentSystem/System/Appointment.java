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
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author THinton
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
    /**
     *<p>Takes user and duplicate file except of param user, then the old file is replaced by the new file, Removing selected user  </p>
     * @param SelectedUser : User that has request accepted
     * @throws IOException
     */
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
      
    /**
     *<p> Reads appointment file and return all data as an array list </p>
     * @return : An Appointment Array list of all current appointments 
     */
    public static ArrayList<Appointment> readAppointment()
    {
        ArrayList<Appointment> newAppointment = new ArrayList<>();
        
        
          try
        {
            FileReader fread = new FileReader("Appointment.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String id = "1";

            while ((id = bread.readLine()) != null) {
                String  idpatient = bread.readLine();
                String date = bread.readLine();
                
                Appointment user = new Appointment(id,idpatient,date);
                newAppointment.add(user);                
            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newAppointment);
        }
        
    /**
     *<p>Adds a new appointment using param </p>
     * @param newAppointment: New appointment made by the user
     * @throws IOException
     */
    public static void AddAppointment( Appointment newAppointment) throws IOException
    {
         try (FileWriter writer = new FileWriter("Appointment.txt", true)) {
            writer.write(newAppointment.getDoctor_ID() );
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getPatient_ID());
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getDates());
            writer.write(System.getProperty("line.separator"));
            writer.close();
        }      
    }
               
    /**
     *<p> Adds a new appointment request using param</p>
     * @param newAppointment : New appointment request made by the patient
     * @throws IOException
     */
    public static void AddAppointmentRequest( Appointment newAppointment) throws IOException
    {
         try (FileWriter writer = new FileWriter("RequestAppointment.txt", true)) {
           // writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getDoctor_ID() );
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getPatient_ID());
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getDates());
            writer.close();
        }     
    }
     
    /**
     *<p> Reads all appointment requests and turns data into Appointment array list
     * @return : An Appointment Array list of all requests</p>
     */
    public static ArrayList<Appointment> readAppointmentRequest()
    {
        ArrayList<Appointment> newAppointment = new ArrayList<>();
             
          try
        {
            FileReader fread = new FileReader("RequestAppointment.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String id = "1";

            while ((id = bread.readLine()) != null) {
                String  idpatient = bread.readLine();
                String date = bread.readLine();
                
                Appointment user = new Appointment(id,idpatient,date);
                newAppointment.add(user);                
            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newAppointment);}
    
    
}
