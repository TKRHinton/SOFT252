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
public class Patient {
    private String user_ID;
    private String Name; 
    private String Address;
    private String Password;
    private String Gender;
    private Integer Age;
    
    public Patient()
    {
        
    }
        public Patient(String user_ID,String Name,String Address,String Password, String Gender,Integer Age)
    {
        this.user_ID = user_ID;
        this.Name = Name;
        this.Address = Address;
        this.Password = Password;
        this.Gender = Gender;
        this.Age = Age;       
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }
    
    
    
}
