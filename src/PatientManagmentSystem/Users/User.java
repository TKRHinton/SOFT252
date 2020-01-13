/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.Users;

import PatientManagmentSystem.GeneratorStrategy.GeneratorInterface;

/**
 *
 * @author thinton
 */
public class User {
    private String user_ID;
    private String Name; 
    private String Address;
    private String Password;
    
    /**
     *
     */
    public GeneratorInterface GenerateType;
    
    /**
     *
     * @return
     */
    public String GenerateID()
    {
        return GenerateType.Generate();
    }
    
    /**
     *
     * @param newGenerateType
     */
    public void setGenerateType(GeneratorInterface newGenerateType)
    {
        GenerateType = newGenerateType;
    }
    
    /**
     *
     */
    public User()
    {
        
    }
    
    /**
     *
     * @param user_ID
     */
    public User(String user_ID)
    {
         this.user_ID = user_ID;
    }
    
    /**
     *
     * @param user_ID
     * @param Name
     * @param Address
     * @param Password
     */
    public User(String user_ID, String Name, String Address, String Password)
    {
        this.user_ID = user_ID;
        this.Name = Name;
        this.Address = Address;
        this.Password = Password;
    }
    
    /**
     *
     * @param Name
     * @param Address
     */
    public User(String Name, String Address)
    {
        this.Name = Name;
        this.Address = Address;
    }

    /**
     *
     * @return
     */
    public String getUser_ID() {
        return user_ID;
    }

    /**
     *
     * @param user_ID
     */
    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return Address;
    }

    /**
     *
     * @param Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return Password;
    }

    /**
     *
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
}
