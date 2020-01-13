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
    
    /**
     *
     */
    public Patient()
    {
        
    }

    /**
     *
     * @param user_ID
     * @param Name
     * @param Address
     * @param Password
     * @param Gender
     * @param Age
     */
    public Patient(String user_ID,String Name,String Address,String Password, String Gender,String Age)
    {
        super(user_ID, Name,Address,Password);

        this.Gender = Gender;
        this.Age = Age;       
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return Gender;
    }

    /**
     *
     * @param Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     *
     * @return
     */
    public String getAge() {
        return Age;
    }

    /**
     *
     * @param Age
     */
    public void setAge(String Age) {
        this.Age = Age;
    }
    
    
    
}
