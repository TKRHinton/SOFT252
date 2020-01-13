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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THinton
 */
public class WritingPatient extends WritingTemplate{
    
    /**
     *<p>Writes the basic and addtional info of user into accountsPatients.TXT file</p>
     * @param newuser: New user to be added
     * @param file: File to write new user in
     */
    @Override
    protected void Addedinfo(Patient newuser, String file) {
        
        try (FileWriter writer = new FileWriter(file, true)) {
        writer.write(newuser.getAge());
        writer.write(System.getProperty("line.separator"));
        writer.write(newuser.getGender());
        writer.write(System.getProperty("line.separator"));
        writer.close();
           } catch (IOException ex) {
            Logger.getLogger(WritingPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
