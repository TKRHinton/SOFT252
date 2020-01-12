/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

import static PatientManagmentSystem.System.Medicine.AddMedicine;
import static PatientManagmentSystem.System.Medicine.AddMedicineRequest;
import static PatientManagmentSystem.System.Medicine.readMedicine;
import static PatientManagmentSystem.System.Medicine.readMedicineRequest;
import java.io.FileWriter;
import java.util.ArrayList;
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
public class MedicineTest {
    String result;
    Medicine test = new Medicine();
    
    public MedicineTest() {
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
        test = new Medicine("Test");
    }
    
    @After
    public void tearDown() {
        
        
    }

    @Test
    public void testGetMedicine() {
    }

    @Test
    public void testSetMedicine() {
    }

    @Test
    public void testReadMedicine() {
    }

    @Test
    public void testReadMedicineRequest() {
    }

    @Test
    public void testAddMedicine() throws Exception {
         
        AddMedicine(test);
        
        ArrayList<Medicine> users = readMedicine();
        
          for (int i = 0; i < (users.size()); i++) {
                  users.get(i);
                if(users.get(i).getMedicine().equals("Test"))
                {
                     result = "Test";
                }
          }            
            assertEquals("Test",result);    
    }

    @Test
    public void testAddMedicineRequest() throws Exception {
       
        AddMedicineRequest(test);
        
        ArrayList<Medicine> users = readMedicineRequest();
        
          for (int i = 0; i < (users.size()); i++) {
                  users.get(i);
                if(users.get(i).getMedicine().equals("Test"))
                {
                     result = "Test";
                }
          }
            
            assertEquals("Test",result);       
               
    }
    
}

    

