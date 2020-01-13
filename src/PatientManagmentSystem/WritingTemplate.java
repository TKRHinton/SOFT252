/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem;

import PatientManagmentSystem.Users.Patient;
import PatientManagmentSystem.Users.User;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Theon
 */
public abstract class  WritingTemplate {
    
    /**
     *
     * @param newuser
     * @param file
     * @throws IOException
     */
    public final void writetofile(Patient newuser, String file) throws IOException{
        User users = newuser;

        Basicinfo(users, file);
        if (Addedinfopresent())
        {
            Addedinfo(newuser, file);
        }
    };
    
    /**
     *
     * @param newuser
     * @param file
     * @throws IOException
     */
    protected void Basicinfo(User newuser, String file) throws IOException{
    
       try (FileWriter writer = new FileWriter(file, true)) {
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
    
    /**
     *
     * @param newuser
     * @param file
     */
    protected abstract void Addedinfo(Patient newuser, String file);
    
    boolean Addedinfopresent() {return true;}
    
}
