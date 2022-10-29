/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Hospital {
    String hospitalName;
    private Admin hospitalAdmin;
    private DoctorDirectory doctorList;
    public Hospital(){
        this.doctorList=new DoctorDirectory();
    }

    public DoctorDirectory getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }

    public Admin getHospitalAdmin() {
        return hospitalAdmin;
    }

    public void setHospitalAdmin(Admin hospitalAdmin) {
        this.hospitalAdmin = hospitalAdmin;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

   
    @Override
    public String toString(){
        return hospitalName;
    }

    
    
}
