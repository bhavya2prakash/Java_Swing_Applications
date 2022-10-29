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
    private VitalSigns viatlSigns; 
    private EncounterCatalogue encounterHistory;

    public Patient(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public VitalSigns getViatlSigns() {
        return viatlSigns;
    }

    public void setViatlSigns(VitalSigns viatlSigns) {
        this.viatlSigns = viatlSigns;
    }

    public EncounterCatalogue getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterCatalogue encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
}
