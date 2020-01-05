/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.System;

/**
 *
 * @author Theon
 */
public class DoctorFeedback {
    private String Doctor_ID;
    private Integer Rating;
    private String FeedbackNotes;

    public DoctorFeedback() {
    }

    public DoctorFeedback(String Doctor_ID, Integer Rating, String FeedbackNotes) {
        this.Doctor_ID = Doctor_ID;
        this.Rating = Rating;
        this.FeedbackNotes = FeedbackNotes;
    }

    public String getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(String Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
    }

    public Integer getRating() {
        return Rating;
    }

    public void setRating(Integer Rating) {
        this.Rating = Rating;
    }

    public String getFeedbackNotes() {
        return FeedbackNotes;
    }

    public void setFeedbackNotes(String FeedbackNotes) {
        this.FeedbackNotes = FeedbackNotes;
    }
    
    
}
