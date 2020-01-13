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
public class GenerateSecretaryID implements GeneratorInterface{

   /**
     *<p>Generates a new random ID</p>
     * @return : New ID for the user
     */
    @Override
    public String Generate(){
        String SecretaryID = "S";
        String Password = "";
        
        Random ran = new Random();
          
        Integer ID = ran.nextInt(9000) + 1000;
        
        Password = SecretaryID + ID.toString();
                 
        return (Password);
    }
    
}
