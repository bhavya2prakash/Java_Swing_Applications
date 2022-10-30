/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Doctor {
     private Person person;
     private String speciality;
     private String degree;
     private String availability;
     
     private PatientDirectory patientList = new PatientDirectory();
    public PatientDirectory getPatientList() {
        
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }
     
    public Doctor(Person person, String speciality, String degree,String availability ) {
        this.person = person;
        this.speciality = speciality;
        this.degree = degree;
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
    @Override
    public String toString(){
        return this.person.getPersonName();
    }
     
}
