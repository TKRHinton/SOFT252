
import PatientManagmentSystem.AdministratorSystem.AdminAccount;
import PatientManagmentSystem.Users.User;
import static PatientManagmentSystem.Utility.checkDetails;
import static PatientManagmentSystem.Utility.newUser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Theon
 */
public class UtilityTest {
    
    /**
     *
     * @throws IOException
     */
   // @Test
    public void shouldreturnPatient() throws IOException {
        // given
        
        String ID = "TestID";
        String Name = "TestName";
        String Address = "Address";
        String Password = "Password";
   
        
     
        
        // When
          User Test = new User(ID,Name,Address,Password);
        
        
            newUser(Test);
            
            Boolean check = checkDetails(ID, Password);
            
            
            
         // Then 
         
       //  self.assertTrue(check);

        
    }
    
}
