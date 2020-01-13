/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.GeneratorStrategy;

import java.util.Random;

/**
 *
 * @author Theon
 */
public class GeneratePassword implements GeneratorInterface{
    
    /**
     *
     * @return
     */
    @Override
    public String Generate(){
        
        String Password = "";
        
        Random ran = new Random();
          
        Integer ID = ran.nextInt(9000) + 1000;
        
        Password = ID.toString();
                 
        return (Password);
    }
    
}
