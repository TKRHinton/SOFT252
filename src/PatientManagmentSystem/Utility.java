/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem;

import PatientManagmentSystem.System.AccountRequest;
import PatientManagmentSystem.System.Appointment;
import PatientManagmentSystem.System.DoctorFeedback;
import PatientManagmentSystem.System.Medicine;
import PatientManagmentSystem.System.Perscription;
import PatientManagmentSystem.Users.Administrator;
import PatientManagmentSystem.Users.Doctor;
import PatientManagmentSystem.Users.Patient;
import PatientManagmentSystem.Users.Secretary;
import PatientManagmentSystem.Users.User;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author thinton
 */
public class Utility {
    
    public static ArrayList<User> ReadAccountFile()
    {
        ArrayList<User> users = new ArrayList<>();
        
        try
        {
            FileReader fread = new FileReader("accounts.txt");
            BufferedReader bread = new BufferedReader(fread);
           
              String id = "1";
              while ((id = bread.readLine()) != null) { 
                
           
                String password = bread.readLine();
                String name = bread.readLine();
                String address = bread.readLine();
                System.out.println(password);
                
                
                if (id.startsWith("A")) {
                User user = new Administrator(id,name,address,password);
                users.add(user);}
                
                else  if (id.startsWith("D")) {
                User user = new Doctor(id,name,address,password);
                users.add(user);} 
                
                else  if (id.startsWith("S")) {
                User user = new Secretary(id,name,address,password);
                users.add(user);         
            }
              }
            bread.close();
            fread.close();                          
      }       
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (users);
    }
       
     public static ArrayList<Patient> ReadPatientFile()
    {
        ArrayList<Patient> users = new ArrayList<>();
        
        try
        {
            FileReader fread = new FileReader("accountsPatient.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String id = "1";

            while ((id = bread.readLine()) != null) {
                String password = bread.readLine();
                String name = bread.readLine();
                String address = bread.readLine();
                String Age = bread.readLine();
                String Gender = bread.readLine();
                
                
                Patient user = new Patient(id,name,address,password,Gender,Age);
                users.add(user);
                
            }
            bread.close();
            fread.close();                         
      }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (users);
    }
      public static boolean checkDetails(String username, String password)
      {
          boolean Correct = false;
          
          if (username.startsWith("P"))
          {
              ArrayList<Patient> users = ReadPatientFile();
              User user = new User();
              for (int i = 0; i < (users.size()); i++) {
                  user = users.get(i);
                  if (user.getUser_ID().equals(username) && user.getPassword().equals(password))
                  {
                      Correct = true;
                      return Correct;
                  }                               
              }
          }
          else
          {
                  ArrayList<User> users = ReadAccountFile();
              User user = new User();
              for (int i = 0; i < (users.size()); i++) {
                  user = users.get(i);
                 // System.out.println(user.getPassword());
                 // System.out.println(password);
                 // System.out.println(username);
                 // System.out.println(user.getUser_ID());
                if (user.getUser_ID().equals(username) && user.getPassword().equals(password))
                  {
                      Correct = true;
                      return Correct;
                  }                                                  
              }
          }    
            JOptionPane.showMessageDialog(null, "Incorrect Password");
          return Correct;        
        }
      
      
      
      public static String GenerateID(String userLetter)
      {
          Random ran = new Random();
          
          Integer ID = ran.nextInt(9000) + 1000;
          
          String NewID = userLetter + ID.toString();       
          
          return NewID;
      }
      
      
      public static void newUser(User newuser) throws IOException
      {              
        try (FileWriter writer = new FileWriter("accounts.txt", true)) {
            writer.write(newuser.getUser_ID());
            writer.write(System.getProperty("line.separator"));
            writer.write(newuser.getPassword());
            writer.write(System.getProperty("line.separator"));
            writer.write(newuser.getName());
            writer.write(System.getProperty("line.separator"));
            writer.write(newuser.getAddress());
            writer.write(System.getProperty("line.separator"));
            writer.close();
        }                
      }
      
        public static void newPatient(Patient newuser) throws IOException
      {              
        try (FileWriter writer = new FileWriter("accountsPatient.txt", true)) {
            writer.write(newuser.getUser_ID());
            writer.write(System.getProperty("line.separator"));
            writer.write(newuser.getPassword());
            writer.write(System.getProperty("line.separator"));
            writer.write(newuser.getName());
            writer.write(System.getProperty("line.separator"));
            writer.write(newuser.getAddress());
            writer.write(System.getProperty("line.separator"));           
            writer.write(newuser.getAge());
            writer.write(System.getProperty("line.separator"));
            writer.write(newuser.getGender());
            writer.write(System.getProperty("line.separator"));
            writer.close();
        }                
      }
        
        
        
        public static void DeleteUser(String SelectedUser) throws IOException
        {
            String tempFile = "temp.txt";
            File oldFile = new File("accounts.txt");
            File newFile = new File(tempFile);
            
            String id = "Error"; String password = "Error"; String name = "Error"; String address = "Error";
            
            
             try  {
                 FileWriter writer = new FileWriter(tempFile, true);
                 BufferedWriter bwrite = new BufferedWriter(writer);
                 PrintWriter pwrite = new PrintWriter(bwrite);
                 
                 
                 FileReader fread = new FileReader("accounts.txt");
                 BufferedReader bread = new BufferedReader(fread);
           
              
                 while ((id = bread.readLine()) != null) { 
                
                 password = bread.readLine();
                 name = bread.readLine();
                 address = bread.readLine();
             
            
                 if(!id.equals(SelectedUser))
                 {
                      writer.write(id);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(password);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(name);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(address);
                      writer.write(System.getProperty("line.separator"));                                            
                    }
                 }
                 fread.close();
                 pwrite.flush();
                 pwrite.close();
                 oldFile.delete();
                 File dump = new File("accounts.txt");
                 newFile.renameTo(dump);}
             
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null, "Error" + e);
             }
        }
        
         public static void DeletePatient(String SelectedUser) throws IOException
        {
            String tempFile = "temp.txt";
            File oldFile = new File("accountsPatient.txt");
            File newFile = new File(tempFile);
            
            String id = "Error"; String password = "Error"; String name = "Error"; String address = "Error"; String age = "Error"; String gender = "error";
            
            
             try  {
                 FileWriter writer = new FileWriter(tempFile, false);
                 BufferedWriter bwrite = new BufferedWriter(writer);
                 PrintWriter pwrite = new PrintWriter(bwrite);
                 
                 
                 FileReader fread = new FileReader("accountsPatient.txt");
                 BufferedReader bread = new BufferedReader(fread);
           
              
                 while ((id = bread.readLine()) != null) { 
                
                 password = bread.readLine();
                 name = bread.readLine();
                 address = bread.readLine();
                 age = bread.readLine();
                 gender = bread.readLine();
             
                 if(!id.equals(SelectedUser))
                 {
                      writer.write(id);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(password);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(name);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(address);
                      writer.write(System.getProperty("line.separator")); 
                       writer.write(age);
                      writer.write(System.getProperty("line.separator"));
                      writer.write(gender);
                      writer.write(System.getProperty("line.separator"));   
                    }
                 }
                 fread.close();
                 pwrite.flush();
                 pwrite.close();
                 oldFile.delete();
                 File dump = new File("accountsPatient.txt");
                 newFile.renameTo(dump);}
             
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null, "Error" + e);
             }
        }
        
        public static void newFeedback(DoctorFeedback newFeedback) throws IOException
        {
            try (FileWriter writer = new FileWriter("DoctorFeedback.txt", true)) {
            writer.write(System.getProperty("line.separator"));
            writer.write(newFeedback.getDoctor_ID() );
            writer.write(System.getProperty("line.separator"));
            writer.write(newFeedback.getRating());
            writer.write(System.getProperty("line.separator"));
            writer.write(newFeedback.getFeedbackNotes());
            writer.close();
        }                
        }
        
        public static ArrayList<DoctorFeedback> readFeedback()
        {
                ArrayList<DoctorFeedback> feedback = new ArrayList<>();
        
        try
        {
            FileReader fread = new FileReader("DoctorFeedback.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String id = "1";

            while ((id = bread.readLine()) != null) {
                String  rating = bread.readLine();
                String notes = bread.readLine();
                
                DoctorFeedback user = new DoctorFeedback(id,rating,notes);
                feedback.add(user);                
            }
            bread.close();
            fread.close();                         
      }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (feedback);
        }
        
        
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
        
     
    public static void AddAppointment( Appointment newAppointment) throws IOException
    {
         try (FileWriter writer = new FileWriter("Appointment.txt", true)) {
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getDoctor_ID() );
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getPatient_ID());
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getDates());
            writer.close();
        }
      
    }
    
    
            
     public static void AddAppointmentRequest( Appointment newAppointment) throws IOException
    {
         try (FileWriter writer = new FileWriter("RequestAppointment.txt", true)) {
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getDoctor_ID() );
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getPatient_ID());
            writer.write(System.getProperty("line.separator"));
            writer.write(newAppointment.getDates());
            writer.close();
        }
      
    }
     
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
        
        return (newAppointment);
        }
    
     public static void AddMedicine( Medicine medicine) throws IOException
    {
         try (FileWriter writer = new FileWriter("Medicine.txt", true)) {
            writer.write(System.getProperty("line.separator"));
            writer.write(medicine.getMedicine() );
            writer.close();
        }     
    }
          public static void AddMedicineRequest( Medicine medicine) throws IOException
    {
         try (FileWriter writer = new FileWriter("MedicineRequest.txt", true)) {
            writer.write(System.getProperty("line.separator"));
            writer.write(medicine.getMedicine() );
            writer.close();
        }     
    }
          
          public static ArrayList<Medicine> readMedicine()
    {
        ArrayList<Medicine> newMedicine = new ArrayList<>();
        
        
          try
        {
            FileReader fread = new FileReader("Medicine.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String Med = "1";

            while ((Med = bread.readLine()) != null) {
                
                Medicine user = new Medicine(Med);
                newMedicine.add(user);                
            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newMedicine);
        }
     
     
     public static ArrayList<Medicine> readMedicineRequest()
    {
        ArrayList<Medicine> newMedicine = new ArrayList<>();
        
        
          try
        {
            FileReader fread = new FileReader("MedicineRequest.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String Med = "1";

            while ((Med = bread.readLine()) != null) {
                
                Medicine user = new Medicine(Med);
                newMedicine.add(user);                
            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newMedicine);
        }
     
     public static void AddPersrciption( Perscription newPersrciption) throws IOException
    {
         try (FileWriter writer = new FileWriter("Perscription.txt", true)) {
            writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getDoctor_ID() );
            writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getPatient_ID());
            writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getDoctorNotes());
             writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getMedicine());
             writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getQuantity());
             writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getDosage());
            writer.close();
        }
      
    }
     
     public static ArrayList<Perscription> readPerscription()
     {
           ArrayList<Perscription> newPerscription = new ArrayList<>();
        
        
          try
        {
            FileReader fread = new FileReader("Perscription.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String id = "1";

            while ((id = bread.readLine()) != null) {
                String  idpatient = bread.readLine();
                String notes = bread.readLine();
                String medicine = bread.readLine();
                String quantity = bread.readLine();
                String dosage = bread.readLine();
                
                
                Perscription user = new Perscription(id,idpatient,notes,medicine,quantity,dosage);
                newPerscription.add(user);  

            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newPerscription);
     }
     
     
     public static void newAccountRequest (User Request) throws IOException
     {
           try (FileWriter writer = new FileWriter("AccountRequest.txt", true)) {
            writer.write(System.getProperty("line.separator"));
            writer.write(Request.getName() );
            writer.write(System.getProperty("line.separator"));
            writer.write(Request.getAddress());
             writer.close();
           }}
           
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
        
        return (newRequest);
     }
           
           
     
     
      public static void WritePatientlogin (String ID) throws IOException
     {
           try (FileWriter writer = new FileWriter("Logged.txt", false)) {
            writer.write(ID );

             writer.close();
           }
     }
      
      
              
       public static void WriteDeleteRequest(String ID) throws IOException
     {
           try (FileWriter writer = new FileWriter("DeleteRequest.txt", true)) {
            
            writer.write(System.getProperty("line.separator"));
            writer.write(ID);

             writer.close();
           }
     }
              
               public static ArrayList<User> ReadDeleteRequest()                      
    {
        ArrayList<User> newDelete = new ArrayList<>();
        
        String ID = "";
        
          try
        {
            FileReader fread = new FileReader("DeleteRequest.txt");
            BufferedReader bread = new BufferedReader(fread);          

             
              while ((ID = bread.readLine()) != null) {

                
                User user = new User(ID);
                newDelete.add(user);                
            }
            bread.close();
            fread.close();     
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newDelete);
        }
      
        public static String ReadPatientlogin()
    {
        
        String ID = "";
        
          try
        {
            FileReader fread = new FileReader("Logged.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                 ID = bread.readLine();

            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (ID);
        }
        
        
           public static void DeleteDeleteRequest(String SelectedUser) throws IOException
        {
            String tempFile = "temp.txt";
            File oldFile = new File("DeleteRequest.txt");
            File newFile = new File(tempFile);
            
            String PatientID = "Error"; 
            
            
             try  {
                 FileWriter writer = new FileWriter(tempFile, false);
                 BufferedWriter bwrite = new BufferedWriter(writer);
                 PrintWriter pwrite = new PrintWriter(bwrite);
                 
                 
                 FileReader fread = new FileReader("DeleteRequest.txt");
                 BufferedReader bread = new BufferedReader(fread);
           
                 
                 while ((PatientID = bread.readLine()) != null) { 
                     System.out.println(PatientID);

             
            
                 if(!PatientID.equals(SelectedUser))
                 {
                      writer.write(PatientID);
                      writer.write(System.getProperty("line.separator"));

                                                    
                    }
                 }
                 fread.close();
                 pwrite.flush();
                 pwrite.close();
                 oldFile.delete();
                 File dump = new File("DeleteRequest.txt");
                 newFile.renameTo(dump);}
             
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null, "Error" + e);
             }
        }
        
       
        
}
