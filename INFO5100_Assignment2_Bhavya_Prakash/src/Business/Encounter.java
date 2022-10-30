/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.Date;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Encounter {
    private int encounterId;
    private String appointmentDetails;
    private VitalSigns viatlSigns; 
    private Date encounterDateTime;
    private String diagnosis;
    private String symptoms;
    private String status = "Appointment request pending";

    public Encounter(int encounterId, String appointmentDetails) {
        this.encounterId = encounterId;
        this.appointmentDetails = appointmentDetails;
    }

    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }

    public String getAppointmentDetails() {
        return appointmentDetails;
    }

    public void setAppointmentDetails(String appointmentDetails) {
        this.appointmentDetails = appointmentDetails;
    }

   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VitalSigns getViatlSigns() {
        return viatlSigns;
    }

    public void setViatlSigns(VitalSigns viatlSigns) {
        this.viatlSigns = viatlSigns;
    }

    public Date getEncounterDateTime() {
        return encounterDateTime;
    }

    public void setEncounterDateTime(Date encounterDateTime) {
        this.encounterDateTime = encounterDateTime;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    
    
    
}
