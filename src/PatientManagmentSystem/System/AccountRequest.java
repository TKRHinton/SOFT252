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
public class AccountRequest {
    private String PatientName;
    private String PatientAddress;

    public AccountRequest() {
    }

    public AccountRequest(String PatientName, String PatientAddress) {
        this.PatientName = PatientName;
        this.PatientAddress = PatientAddress;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientAddress() {
        return PatientAddress;
    }

    public void setPatientAddress(String PatientAddress) {
        this.PatientAddress = PatientAddress;
    }
    
    
}
