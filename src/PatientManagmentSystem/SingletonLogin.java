/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem;

/**
 *
 * @author Theon
 */
public class SingletonLogin {
    
    private static SingletonLogin LoginID ;//= new SingletonLogin;
    
    private SingletonLogin(){};
    
    /**
     *
     * @return
     */
    public static SingletonLogin getlogin()
    {
        if (LoginID == null) {
            LoginID = new SingletonLogin();
        }
        return LoginID;
    }
    
    
    
    
    
}
