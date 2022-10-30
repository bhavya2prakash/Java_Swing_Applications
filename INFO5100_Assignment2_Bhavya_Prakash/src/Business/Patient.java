/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;



/**
 *
 * @author BHAVYA PRAKASH
 */
public class Patient {
    private Person person;
    private int patientId =001;
    private EncounterHistory encounterHistory = new EncounterHistory();

    public Patient(Person person) {
        this.person = person;
        patientId++;
    }
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
     @Override
    public String toString(){
        return this.person.getPersonName();
    }
    
}
