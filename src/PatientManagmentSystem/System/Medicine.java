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
public class Medicine {
    private String Medicine;

    /**
     *
     */
    public Medicine() {
    }

    /**
     *
     * @param Medicine
     */
    public Medicine(String Medicine) {
        this.Medicine = Medicine;
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
    public static ArrayList<Medicine> readMedicine()
    {
        ArrayList<Medicine> newMedicine = new ArrayList<>();
        
        
          try
        {
            FileReader fread = new FileReader("Medicine.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String Med = "1";

            while ((Med = bread.readLine()) != null) {
                
                Medicine user = new Medicine(Med);
                newMedicine.add(user);                
            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newMedicine);
        }
      
    /**
     *
     * @return
     */
    public static ArrayList<Medicine> readMedicineRequest()
    {
        ArrayList<Medicine> newMedicine = new ArrayList<>();
        
        
          try
        {
            FileReader fread = new FileReader("MedicineRequest.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String Med = "1";

            while ((Med = bread.readLine()) != null) {
                
                Medicine user = new Medicine(Med);
                newMedicine.add(user);                
            }
            bread.close();
            fread.close();                         
        }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (newMedicine);
        }
        
    /**
     *
     * @param medicine
     * @throws IOException
     */
    public static void AddMedicine( Medicine medicine) throws IOException
    {
         try (FileWriter writer = new FileWriter("Medicine.txt", true)) {
            
            writer.write(medicine.getMedicine() );
            writer.write(System.getProperty("line.separator"));
            writer.close();
        }     
    }

    /**
     *
     * @param medicine
     * @throws IOException
     */
    public static void AddMedicineRequest( Medicine medicine) throws IOException
    {
         try (FileWriter writer = new FileWriter("MedicineRequest.txt", true)) {
            
            writer.write(medicine.getMedicine() );
            writer.write(System.getProperty("line.separator"));
            writer.close();
        }     
    }
    
    
}
