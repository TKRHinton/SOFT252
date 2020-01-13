/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Theon
 */
public class Perscription {
    private String Doctor_ID;
    private String Patient_ID;
    private String DoctorNotes;
    private String Medicine;
    private String Quantity;
    private String Dosage;

    /**
     *
     */
    public Perscription() {
    }

    /**
     *
     * @param Doctor_ID
     * @param Patient_ID
     * @param DoctorNotes
     * @param Medicine
     * @param Quantity
     * @param Dosage
     */
    public Perscription(String Doctor_ID, String Patient_ID, String DoctorNotes, String Medicine, String Quantity, String Dosage) {
        this.Doctor_ID = Doctor_ID;
        this.Patient_ID = Patient_ID;
        this.DoctorNotes = DoctorNotes;
        this.Medicine = Medicine;
        this.Quantity = Quantity;
        this.Dosage = Dosage;
    }

    /**
     *
     * @return
     */
    public String getDoctor_ID() {
        return Doctor_ID;
    }

    /**
     *
     * @param Doctor_ID
     */
    public void setDoctor_ID(String Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
    }

    /**
     *
     * @return
     */
    public String getPatient_ID() {
        return Patient_ID;
    }

    /**
     *
     * @param Patient_ID
     */
    public void setPatient_ID(String Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    /**
     *
     * @return
     */
    public String getDoctorNotes() {
        return DoctorNotes;
    }

    /**
     *
     * @param DoctorNotes
     */
    public void setDoctorNotes(String DoctorNotes) {
        this.DoctorNotes = DoctorNotes;
    }

    /**
     *
     * @return
     */
    public String getMedicine() {
        return Medicine;
    }

    /**
     *
     * @param Medicine
     */
    public void setMedicine(String Medicine) {
        this.Medicine = Medicine;
    }

    /**
     *
     * @return
     */
    public String getQuantity() {
        return Quantity;
    }

    /**
     *
     * @param Quantity
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     *
     * @return
     */
    public String getDosage() {
        return Dosage;
    }

    /**
     *
     * @param Dosage
     */
    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }
    
    /**
     *
     * @param newPersrciption
     * @throws IOException
     */
    public static void AddPersrciption( Perscription newPersrciption) throws IOException
    {
         try (FileWriter writer = new FileWriter("Perscription.txt", true)) {
           
            writer.write(newPersrciption.getDoctor_ID() );
            writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getPatient_ID());
            writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getDoctorNotes());
             writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getMedicine());
             writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getQuantity());
             writer.write(System.getProperty("line.separator"));
            writer.write(newPersrciption.getDosage());
             writer.write(System.getProperty("line.separator"));
            writer.close();
        }
      
    }
     
    /**
     *
     * @return
     */
    public static ArrayList<Perscription> readPerscription()
     {
           ArrayList<Perscription> newPerscription = new ArrayList<>();
        
        
          try
        {
            FileReader fread = new FileReader("Perscription.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String id = "1";

            while ((id = bread.readLine()) != null) {
                String  idpatient = bread.readLine();
                String notes = bread.readLine();
                String medicine = bread.readLine();
                String quantity = bread.readLine();
                String dosage = bread.readLine();
                
                
                Perscription user = new Perscription(id,idpatient,notes,medicine,quantity,dosage);
                newPerscription.add(user);  

            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newPerscription);
     }
    
    
    
}
