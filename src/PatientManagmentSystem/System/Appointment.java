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
public class Appointment {
    private String Doctor_ID;
    private String Patient_ID;
    private String Dates;

    public Appointment() {
    }

    public Appointment(String Doctor_ID, String Patient_ID, String Dates) {
        this.Doctor_ID = Doctor_ID;
        this.Patient_ID = Patient_ID;
        this.Dates = Dates;
    }

    public String getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(String Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
    }

    public String getPatient_ID() {
        return Patient_ID;
    }

    public void setPatient_ID(String Patient_ID) {
        this.Patient_ID = Patient_ID;
    }

    public String getDates() {
        return Dates;
    }

    public void setDates(String Dates) {
        this.Dates = Dates;
    }
    
    
}
