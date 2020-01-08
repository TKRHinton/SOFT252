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
           
            String line;

            while ((line = bread.readLine()) != null) {
                String[] account = line.split(",");          
                String id = account[0];
                String password = account[1];
                String name = account[2];
                String address = account[3];
                
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
           
            String line;

            while ((line = bread.readLine()) != null) {
                String[] account = line.split(",");          
                String id = account[0];
                String password = account[1];
                String name = account[2];
                String address = account[3];
                String Age = account[4];
                String Gender = account[5];
                
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
    
    
    
    
}
