/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

import static PatientManagmentSystem.System.AccountRequest.DeleteAccountRequest;
import static PatientManagmentSystem.System.AccountRequest.newAccountRequest;
import static PatientManagmentSystem.System.AccountRequest.readAccountRequest;
import PatientManagmentSystem.Users.User;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Theon
 */
public class AccountRequestTest {
    String result;
    User test = new User();
    
    public AccountRequestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        result = "False";
        test = new User("TestName", "TestAddress");
    }
    
    @After
    public void tearDown() throws IOException {
        DeleteAccountRequest("TestName");
    }

    @Test
    public void testGetPatientName() {
    }

    @Test
    public void testSetPatientName() {
    }

    @Test
    public void testGetPatientAddress() {
    }

    @Test
    public void testSetPatientAddress() {
    }

    @Test
    public void testDeleteAccountRequest() throws Exception {
        
          newAccountRequest(test);
          DeleteAccountRequest("TestName");
        
        
        
         ArrayList<AccountRequest> users = readAccountRequest();
        for (int i = 0; i < (users.size()); i++) {
            
            
              if(users.get(i).getPatientName().equals("TestName"))
                {
                     result = "True";
                }
          }            
            assertEquals("False",result);   
    }

    @Test
    public void testNewAccountRequest() throws Exception {
        
        
        newAccountRequest(test);
        
        
        
         ArrayList<AccountRequest> users = readAccountRequest();
        for (int i = 0; i < (users.size()); i++) {
            
            
              if(users.get(i).getPatientName().equals("TestName"))
                {
                     result = "True";
                }
          }            
            assertEquals("True",result);   


       
        
        
    }

    @Test
    public void testReadAccountRequest() {
    }
    
}
