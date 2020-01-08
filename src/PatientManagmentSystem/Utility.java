/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem;

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
                users.add(user);
                }
                
                else  if (id.startsWith("D")) {
                User user = new Doctor(id,name,address,password);
                users.add(user);
                } 
                
                else  if (id.startsWith("S")) {
                User user = new Secretary(id,name,address,password);
                users.add(user);
             //   }          
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
    
    
     public static ArrayList<User> ReadPatientFile()
    {
        ArrayList<User> users = new ArrayList<>();
        
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
                
                if (id.startsWith("P")) {
                User user = new Patient(id,name,address,password,Gender,Age);
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
      public static boolean checkDetails(String username, String password)
      {
          boolean Correct = false;
          
          if (username.startsWith("P"))
          {
              ArrayList<User> users = ReadPatientFile();
              User user = new User();
              for (int i = 0; i < (users.size()-1); i++) {
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
              for (int i = 0; i < (users.size()-1); i++) {
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
          
          
          
          return Correct;
          
      }
     
          
    
    
    
    
}
