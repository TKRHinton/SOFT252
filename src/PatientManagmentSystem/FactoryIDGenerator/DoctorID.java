/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.FactoryIDGenerator;

import static PatientManagmentSystem.FactoryIDGenerator.IDInterface.RanNumber;

/**
 *
 * @author Theon
 */
public class DoctorID {
    
      public String DoctorID(String ID)  
          {
              String NewID = ID + RanNumber.toString();
               return NewID;
      
          }
    
}
