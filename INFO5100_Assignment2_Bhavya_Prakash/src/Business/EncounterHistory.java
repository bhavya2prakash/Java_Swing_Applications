/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class EncounterHistory {
 private ArrayList<Encounter> encounterHistory ; 

    public EncounterHistory() {
        this.encounterHistory = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterHistory;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterHistory = encounterList;
    }
    public Encounter addNewEncounter(Encounter encounter){
        
        this.encounterHistory.add(encounter);
        return encounter;
    }
    
 
}
