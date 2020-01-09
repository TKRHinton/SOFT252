/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.FactoryIDGenerator;

import java.util.Random;

/**
 *
 * @author Theon
 */
public interface IDInterface {
    
          public Random ran = new Random();         
          public Integer RanNumber = ran.nextInt(9000) + 1000;
          
          public String userLetter = null;
          
          //String NewID = userLetter + RanNumber.toString();       
          
         
    
    
    
    
}
