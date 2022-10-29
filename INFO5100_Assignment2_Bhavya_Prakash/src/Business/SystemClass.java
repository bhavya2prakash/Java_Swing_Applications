/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class SystemClass {
    
    CityCatalogue cityList;
    PatientDirectory patientList;
    PersonDirectory personList;

    public SystemClass() {
        cityList = new CityCatalogue();
        patientList = new PatientDirectory();
        personList = new PersonDirectory();
    }

    public CityCatalogue getCityList() {
        return cityList;
    }

    public void setCityList(CityCatalogue cityList) {
        this.cityList = cityList;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }
    
}
