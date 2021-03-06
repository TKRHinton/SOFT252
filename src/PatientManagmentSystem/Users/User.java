/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.Users;

import PatientManagmentSystem.GeneratorStrategy.GeneratorInterface;

/**
 *
 * @author THinton
 */
public class User {
    private String user_ID;
    private String Name; 
    private String Address;
    private String Password;
    
    public GeneratorInterface GenerateType;
    
    public String GenerateID()
    {
        return GenerateType.Generate();
    }
    
    public void setGenerateType(GeneratorInterface newGenerateType)
    {
        GenerateType = newGenerateType;
    }
    
    public User()
    {
        
    }
    
    public User(String user_ID)
    {
         this.user_ID = user_ID;
    }
    
    /**
     *
     * @param user_ID : user ID
     * @param Name : User Name
     * @param Address : User Address
     * @param Password : User Password
     */
    public User(String user_ID, String Name, String Address, String Password)
    {
        this.user_ID = user_ID;
        this.Name = Name;
        this.Address = Address;
        this.Password = Password;
    }
    
    public User(String Name, String Address)
    {
        this.Name = Name;
        this.Address = Address;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
