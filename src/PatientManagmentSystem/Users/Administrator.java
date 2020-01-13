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
public class Administrator extends User {
    
    public Administrator()
    {
    }
       
    /**
     *
     * @param user_ID : Admin ID
     * @param Name : Name of admin
     * @param Address : Address of Admin
     * @param Password : Admin Password
     */
    public Administrator(String user_ID,String Name, String Address, String Password)
    {
        super(user_ID, Name,Address,Password);
    }
}


  