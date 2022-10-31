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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList ;


    public HospitalDirectory() {
        this.hospitalList = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    public Hospital addNewHospital(){
        Hospital newHospital = new Hospital();
        hospitalList.add(newHospital);
        return newHospital;
    }
     public void  addNewwHospital(Hospital newHospital){
        
        hospitalList.add(newHospital);
       
    }
    
     public void deleteHospital(Hospital hospital){
        this.hospitalList.remove(hospital);
    }
   }
