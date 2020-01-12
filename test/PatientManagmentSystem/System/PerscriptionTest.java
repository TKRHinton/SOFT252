/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

import static PatientManagmentSystem.System.Perscription.AddPersrciption;
import static PatientManagmentSystem.System.Perscription.readPerscription;
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
public class PerscriptionTest {
    String result;
    Perscription test = new Perscription();
    
    public PerscriptionTest() {
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
        test = new Perscription("TestDocID", "TestPatID", "TestNotes", "TestMedicine", "TestQuanitiy", "TestDosage");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetDoctor_ID() {
    }

    @Test
    public void testSetDoctor_ID() {
    }

    @Test
    public void testGetPatient_ID() {
    }

    @Test
    public void testSetPatient_ID() {
    }

    @Test
    public void testGetDoctorNotes() {
    }

    @Test
    public void testSetDoctorNotes() {
    }

    @Test
    public void testGetMedicine() {
    }

    @Test
    public void testSetMedicine() {
    }

    @Test
    public void testGetQuantity() {
    }

    @Test
    public void testSetQuantity() {
    }

    @Test
    public void testGetDosage() {
    }

    @Test
    public void testSetDosage() {
    }

    @Test
    public void testAddPersrciption() throws Exception {
        
        AddPersrciption(test);
        
        ArrayList<Perscription> perscription = readPerscription();
        
        for (int i = 0; i < (perscription.size()); i++) {
            
            
              if(perscription.get(i).getPatient_ID().equals("TestPatID"))
                {
                     result = "True";
                }
          }            
            assertEquals("True",result);   
    }

    @Test
    public void testReadPerscription() {
    }
    
}
