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
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList = new ArrayList<>();
    public DoctorDirectory() {
        this.doctorList = new ArrayList<>();
    } 

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        doctorList.add(newDoctor);
        return newDoctor;
    }
    
     public void deleteDoctor(Doctor doctor){
        this.doctorList.remove(doctor);
    }
}
