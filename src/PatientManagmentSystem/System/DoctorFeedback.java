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
public class DoctorFeedback {
    private String Doctor_ID;
    private String Rating;
    private String FeedbackNotes;

    /**
     *
     */
    public DoctorFeedback() {
    }

    /**
     *
     * @param Doctor_ID
     * @param Rating
     * @param FeedbackNotes
     */
    public DoctorFeedback(String Doctor_ID, String Rating, String FeedbackNotes) {
        this.Doctor_ID = Doctor_ID;
        this.Rating = Rating;
        this.FeedbackNotes = FeedbackNotes;
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
    public String getRating() {
        return Rating;
    }

    /**
     *
     * @param Rating
     */
    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    /**
     *
     * @return
     */
    public String getFeedbackNotes() {
        return FeedbackNotes;
    }

    /**
     *
     * @param FeedbackNotes
     */
    public void setFeedbackNotes(String FeedbackNotes) {
        this.FeedbackNotes = FeedbackNotes;
    }
    
    /**
     *
     * @param newFeedback
     * @throws IOException
     */
    public static void newFeedback(DoctorFeedback newFeedback) throws IOException
        {
            try (FileWriter writer = new FileWriter("DoctorFeedback.txt", true)) {
            writer.write(newFeedback.getDoctor_ID() );
            writer.write(System.getProperty("line.separator"));
            writer.write(newFeedback.getRating());
            writer.write(System.getProperty("line.separator"));
            writer.write(newFeedback.getFeedbackNotes());
             writer.write(System.getProperty("line.separator"));
            writer.close();
        }                
        }
        
    /**
     *
     * @return
     */
    public static ArrayList<DoctorFeedback> readFeedback()
        {
                ArrayList<DoctorFeedback> feedback = new ArrayList<>();
        
        try
        {
            FileReader fread = new FileReader("DoctorFeedback.txt");
            BufferedReader bread = new BufferedReader(fread);
           
                String id = "1";

            while ((id = bread.readLine()) != null) {
                String  rating = bread.readLine();
                String notes = bread.readLine();
                
                DoctorFeedback user = new DoctorFeedback(id,rating,notes);
                feedback.add(user);                
            }
            bread.close();
            fread.close();                         
      }      
        catch(Exception error)
                {
                    System.out.println("Error" + error);
                }
        
        return (feedback);
        }
    
    
}
