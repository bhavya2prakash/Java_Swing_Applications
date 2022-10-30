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
    private static int i = 101;
    private int encounterId;
    private String appointmentDetails;
    private VitalSigns viatlSigns = new VitalSigns();
    private Date encounterDate;
    private String encounterTime;
    private String diagnosis;
    private String symptoms;
    private String status = "Appointment request pending";

    public Encounter(String appointmentDetails) {
        this.encounterId=i;
        this.appointmentDetails = appointmentDetails;
        i=i+1;
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

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getEncounterTime() {
        return encounterTime;
    }

    public void setEncounterTime(String encounterTime) {
        this.encounterTime = encounterTime;
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
    @Override
    public String toString(){
        return String.valueOf(encounterId);
    }
    
    
}
