/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.FactoryIDGenerator;

/**
 *
 * @author Theon
 */
public class FactoryIDMain {
    
    public static String CalulateID(String ID)
    {
        String NewID = null;
        
        if(ID.equals("A"))
        {
         //   NewID = AdminID(ID);
        }
        else if(ID.equals("P"))
        {
        //    NewID = PatientID(ID);
        }
        else  if(ID.equals("S"))
        {
        //    NewID = SecretaryID(ID);
        }
        else  if(ID.equals("D"))
        {
       //     NewID = DoctorID(ID);
        }
        
        return(NewID);
    }
    
}
