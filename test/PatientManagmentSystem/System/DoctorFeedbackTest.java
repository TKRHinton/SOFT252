/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

import static PatientManagmentSystem.System.DoctorFeedback.newFeedback;
import static PatientManagmentSystem.System.DoctorFeedback.readFeedback;
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
public class DoctorFeedbackTest {
    String result;
    DoctorFeedback test = new DoctorFeedback();
    
    public DoctorFeedbackTest() {
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
        test = new DoctorFeedback("TestID","TestRating", "TestNotes");
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
    public void testGetRating() {
    }

    @Test
    public void testSetRating() {
    }

    @Test
    public void testGetFeedbackNotes() {
    }

    @Test
    public void testSetFeedbackNotes() {
    }

    @Test
    public void testNewFeedback() throws Exception {
        
        newFeedback(test);
        
        ArrayList<DoctorFeedback> Feedback = readFeedback();
        
              for (int i = 0; i < (Feedback.size()); i++) {
            
            
              if(Feedback.get(i).getDoctor_ID().equals("TestID"))
                {
                     result = "True";
                }
          }            
            assertEquals("True",result);   
        
        
        
    }

    @Test
    public void testReadFeedback() {
    }
    
}
