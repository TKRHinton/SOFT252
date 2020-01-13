/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.Users;

/**
 *
 * @author Theon
 */
public class Administrator extends User {
    
    /**
     *
     */
    public Administrator()
    {
    }
       
    /**
     *
     * @param user_ID
     * @param Name
     * @param Address
     * @param Password
     */
    public Administrator(String user_ID,String Name, String Address, String Password)
    {
        super(user_ID, Name,Address,Password);
    }
}


  