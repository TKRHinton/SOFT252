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
public class PatientID implements IDInterface {
    

          public String PatientID(String ID)  
          {
              String NewID = ID + RanNumber.toString();
               return NewID;
      
          }
          
         
    
}
