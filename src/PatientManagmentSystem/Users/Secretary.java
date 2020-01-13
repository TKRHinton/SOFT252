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
public class Secretary extends User{

    /**
     *
     * @param user_ID : Secretary ID
     * @param Name: Secretary Name
     * @param Address: Secretary Address
     * @param Password: Secretary Password
     */
    public Secretary(String user_ID, String Name, String Address, String Password) {
          super(user_ID, Name,Address,Password);
    }

    /**
     *
     */
    public Secretary() {
    }

}