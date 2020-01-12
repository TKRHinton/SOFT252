/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

import static PatientManagmentSystem.System.Appointment.AddAppointment;
import static PatientManagmentSystem.System.Appointment.AddAppointmentRequest;
import static PatientManagmentSystem.System.Appointment.DeleteAppointmentRequest;
import static PatientManagmentSystem.System.Appointment.readAppointment;
import static PatientManagmentSystem.System.Appointment.readAppointmentRequest;
import java.io.IOException;
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
public class AppointmentTest {
    String result;
    Appointment test = new Appointment();
    
    public AppointmentTest() {
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
        test = new Appointment("TestDocID", "TestPatID", "TestDate");
    }
    
    @After
    public void tearDown() throws IOException {
        DeleteAppointmentRequest("TestPatID");
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
    public void testGetDates() {
    }

    @Test
    public void testSetDates() {
    }

    @Test
    public void testDeleteAppointmentRequest() throws Exception {
           AddAppointmentRequest(test);
           DeleteAppointmentRequest("TestPatID");
        
        ArrayList<Appointment> Appointments = readAppointmentRequest();
        
             for (int i = 0; i < (Appointments.size()); i++) {
            
            
              if(Appointments.get(i).getPatient_ID().equals("TestPatID"))
                {
                     result = "True";
                }
          }            
            assertEquals("False",result);   
        
        
        
    }

    @Test
    public void testReadAppointment() {
    }

    @Test
    public void testAddAppointment() throws Exception {
        
       AddAppointment(test);
        
        ArrayList<Appointment> Appointments = readAppointment();
        
         for (int i = 0; i < (Appointments.size()); i++) {
            
            
              if(Appointments.get(i).getPatient_ID().equals("TestPatID"))
                {
                     result = "True";
                }
          }            
            assertEquals("True",result);   
        
        
        
    }

    @Test
    public void testAddAppointmentRequest() throws Exception {
        
        AddAppointmentRequest(test);
        
        ArrayList<Appointment> Appointments = readAppointmentRequest();
        
             for (int i = 0; i < (Appointments.size()); i++) {
            
            
              if(Appointments.get(i).getPatient_ID().equals("TestPatID"))
                {
                     result = "True";
                }
          }            
            assertEquals("True",result);   
        
        
        
    }

    @Test
    public void testReadAppointmentRequest() throws IOException {
        
    }
    
}
