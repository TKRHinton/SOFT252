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
 * @author THinton
 */
public class Utility {
    
 /**
 * <p> Reads the file accounts.TXT and returns values in array list</p?
 * @return  users : An Array list of Accounts (Doctors/Admin/Secretary)
 */
    
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
    
     /**
 * <p> Reads the file accountsPatient.TXT and returns values in array list</p?
 * @return  users : An Array list of Accounts (Patients)
 */
       
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
     
    /**
     *<p> Checks the users input to see if it matches with current user records</p>
     * @param username : User username input
     * @param password : User Password Input
     * @return
     */
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
          
    /**
     *<p>Takes Selected ID and find it in the text file and remove it </p>
     * @param SelectedUser : The selected ID to remove
     * @throws IOException
     */
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
        
    /**
     *<p>Takes Selected ID and find it in the text file and remove it </p>
     * @param SelectedUser : The selected ID to remove
     * @throws IOException
     */
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
             
    /**
     *<p>Puts the ID of the user that has logged in a Logged file to keep track of what user has logged in</p>
     * @param ID: User that has logged in
     * @throws IOException
     */
    public static void WritePatientlogin (String ID) throws IOException
     {
           try (FileWriter writer = new FileWriter("Logged.txt", false)) {
            writer.write(ID );

             writer.close();
           }
     }
             
    /**
     *<p> Writes ID into text file when user requests their account to be deleted</p>
     * @param ID: ID of current logged in user
     * @throws IOException
     */
    public static void WriteDeleteRequest(String ID) throws IOException
     {
           try (FileWriter writer = new FileWriter("DeleteRequest.txt", true)) {
            
            
            writer.write(ID);
            writer.write(System.getProperty("line.separator"));

             writer.close();
           }
     }
             
    /**
     *<p>Reads text file to show secrectary to see all delete requests</p>
     * @return
     */
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
      
    /**
     *<p>Reads file to see which user is logged in</p>
     * @return
     */
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
             
    /**
     *<p>Deletes a users delete request when their request has been Accepted</p>
     * @param SelectedUser : Current user that has had their account deleted
     * @throws IOException
     */
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
