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
public class Patient extends User{

    private String Gender;
    private String Age;
    
    public Patient()
    {
        
    }
        public Patient(String user_ID,String Name,String Address,String Password, String Gender,String Age)
    {
        super(user_ID, Name,Address,Password);

        this.Gender = Gender;
        this.Age = Age;       
    }


    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }
    
    
    
}
