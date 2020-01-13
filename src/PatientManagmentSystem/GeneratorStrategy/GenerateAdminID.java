/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.GeneratorStrategy;

import java.util.Random;

/**
 *
 * @author THinton
 */
public class GenerateAdminID implements GeneratorInterface{
    
    /**
     *<p>Generates a new random ID</p>
     * @return : New ID for the user
     */
    @Override
    public String Generate(){
        String AdminID = "A";
        String Password = "";
        
        Random ran = new Random();
          
        Integer ID = ran.nextInt(9000) + 1000;
        
        Password = AdminID + ID.toString();
                 
        return (Password);
    }
    
}
