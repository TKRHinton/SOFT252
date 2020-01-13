/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.Users;

/**
 *
 * @author THinton
 */
public class Doctor extends User{

    public Doctor()
    {
        
    }
    
    /**
     *
     * @param user_ID : Doctor ID
     * @param Name : Name of doctor
     * @param Address : Address of doctor
     * @param Password : Password Of Doctor Account
     */
    public Doctor(String user_ID, String Name, String Address, String Password)
    {
        super(user_ID, Name,Address,Password);
    }
    
    
}
