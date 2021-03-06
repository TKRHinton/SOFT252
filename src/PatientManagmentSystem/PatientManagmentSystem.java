
package PatientManagmentSystem;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THinton
 */
public class PatientManagmentSystem {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileWriter writer = new FileWriter("q",false);
        File file = new File("accounts.txt");
        if (!file.exists()){

         writer = new FileWriter("accounts.txt", false);
         writer.write("A2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("123");
         writer.write(System.getProperty("line.separator"));
         writer.write("James");
         writer.write(System.getProperty("line.separator"));
         writer.write("13 Richmond Street");
         writer.write(System.getProperty("line.separator"));
          writer.write("D2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("234");
         writer.write(System.getProperty("line.separator"));
         writer.write("John");
         writer.write(System.getProperty("line.separator"));
         writer.write("23 Joke Street");
         writer.write(System.getProperty("line.separator"));
          writer.write("S2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("John1");
         writer.write(System.getProperty("line.separator"));
         writer.write("Leah");
         writer.write(System.getProperty("line.separator"));
         writer.write("23 James Street");
         writer.write(System.getProperty("line.separator"));
          writer.write("D2021");
         writer.write(System.getProperty("line.separator"));
         writer.write("L123");
         writer.write(System.getProperty("line.separator"));
         writer.write("Sammy");
         writer.write(System.getProperty("line.separator"));
         writer.write("238 Sammy Street");
         writer.write(System.getProperty("line.separator"));
         writer.close();
        }
         
         file = new File("accountsPatient.txt");
        if (!file.exists()){
         writer = new FileWriter("accountsPatient.txt", false);
         writer.write("P2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("123");
         writer.write(System.getProperty("line.separator"));
         writer.write("James");
         writer.write(System.getProperty("line.separator"));
         writer.write("23 James Street");
         writer.write(System.getProperty("line.separator"));
         writer.write("22");
         writer.write(System.getProperty("line.separator"));
         writer.write("Male");
         writer.write(System.getProperty("line.separator"));
         writer.write("P2021");
         writer.write(System.getProperty("line.separator"));
         writer.write("kelly111");
         writer.write(System.getProperty("line.separator"));
         writer.write("Kelly");
         writer.write(System.getProperty("line.separator"));
         writer.write("12 Kelly Street");
         writer.write(System.getProperty("line.separator"));
         writer.write("22");
         writer.write(System.getProperty("line.separator"));
         writer.write("Female");
         writer.write(System.getProperty("line.separator"));
         writer.write("P2022");
         writer.write(System.getProperty("line.separator"));
         writer.write("12311");
         writer.write(System.getProperty("line.separator"));
         writer.write("Sam");
         writer.write(System.getProperty("line.separator"));
         writer.write("23 Sam Street");
         writer.write(System.getProperty("line.separator"));
         writer.write("23");
         writer.write(System.getProperty("line.separator"));
         writer.write("Male");
         writer.write(System.getProperty("line.separator"));
         writer.write("P2023");
         writer.write(System.getProperty("line.separator"));
         writer.write("999");
         writer.write(System.getProperty("line.separator"));
         writer.write("Jolly");
         writer.write(System.getProperty("line.separator"));
         writer.write("233 Jolly Street");
         writer.write(System.getProperty("line.separator"));
         writer.write("42");
         writer.write(System.getProperty("line.separator"));
         writer.write("Female");
         writer.write(System.getProperty("line.separator"));    
         writer.close();
        }
         
         file = new File("AccountRequest.txt");
        if (!file.exists()){
         writer = new FileWriter("AccountRequest.txt", false);
         writer.write("Caleb");
         writer.write(System.getProperty("line.separator"));
         writer.write("Wood's Street");
         writer.write(System.getProperty("line.separator"));
         writer.write("Felix");
         writer.write(System.getProperty("line.separator"));
         writer.write("23 Some Street");
         writer.write(System.getProperty("line.separator"));
         writer.close();
        }
          file = new File("Appointment.txt");
        if (!file.exists()){
         writer = new FileWriter("Appointment.txt", false);
         writer.write("D2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("P2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("11/01/2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("D2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("P2021");
         writer.write(System.getProperty("line.separator"));
         writer.write("12/01/2020");
         writer.write(System.getProperty("line.separator"));         
         writer.close();
        }
        
         file = new File("DeleteRequest.txt");
        if (!file.exists()){
         
         writer = new FileWriter("DeleteRequest.txt", false);
         writer.write("P2023");
         writer.write(System.getProperty("line.separator"));
         writer.close();
        }
         
         file = new File("DoctorFeedback.txt");
        if (!file.exists()){
         writer = new FileWriter("DoctorFeedback.txt", false);
         writer.write("D2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("8");
         writer.write(System.getProperty("line.separator"));
         writer.write("Very Good");
         writer.write(System.getProperty("line.separator"));
          writer.write("D2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("5");
         writer.write(System.getProperty("line.separator"));
         writer.write("They were ok");
         writer.write(System.getProperty("line.separator"));       
         writer.close();
        }
         
              writer = new FileWriter("Logged.txt", false);
         writer.close();
         
         
         file = new File("Medicine.txt");
        if (!file.exists()){
              writer = new FileWriter("Medicine.txt", false);
         writer.write("Piriteze");
         writer.write(System.getProperty("line.separator"));
         writer.write("Synthroid");
         writer.write(System.getProperty("line.separator"));
         writer.write("Crestor");
         writer.write(System.getProperty("line.separator"));
         writer.write("Ventolin");
         writer.write(System.getProperty("line.separator"));
         writer.write("Nexium");
         writer.write(System.getProperty("line.separator"));
         writer.write("Advair Diskus");
         writer.write(System.getProperty("line.separator"));
         writer.write("Lantus Solostar");
         writer.write(System.getProperty("line.separator"));
         writer.write("Vyvanse");
         writer.write(System.getProperty("line.separator"));
         writer.write("Lyrica");
         writer.write(System.getProperty("line.separator"));
         writer.write("Januvia");
         writer.write(System.getProperty("line.separator"));
         writer.close();
        }
         
                
                file = new File("MedicineRequest.txt");
        if (!file.exists()){
         writer = new FileWriter("MedicineRequest.txt", false);
         writer.write("PainKillers");
         writer.write(System.getProperty("line.separator"));
         writer.write("Vapor");
         writer.write(System.getProperty("line.separator"));
         writer.close();
        }
         
         
           file = new File("Perscription.txt");
        if (!file.exists()){
         writer = new FileWriter("Perscription.txt", false);
         writer.write("D2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("P2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("Look likes they need it");
         writer.write(System.getProperty("line.separator"));
         writer.write("Lyrica");
         writer.write(System.getProperty("line.separator"));
         writer.write("8");
         writer.write(System.getProperty("line.separator"));
         writer.write("2 Times a day");
         writer.write(System.getProperty("line.separator"));        
         writer.close();
        }
         
         
         
           file = new File("RequestAppointment.txt");
        if (!file.exists()){
            writer = new FileWriter("RequestAppointment.txt", false);
         writer.write("D2020");
         writer.write(System.getProperty("line.separator"));
         writer.write("P2021");
         writer.write(System.getProperty("line.separator"));
         writer.write("21/01/2020");
         writer.write(System.getProperty("line.separator"));
         writer.close();
        }
        
         
        
    
        LoginPage mr=new LoginPage();
        mr.setVisible(true);   
        
        
    }
    
}
