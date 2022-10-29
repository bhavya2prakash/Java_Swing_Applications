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
public class Community {
    
    private String communityName;
    private Admin communityadmin;
    private ArrayList<House> houseList = new ArrayList<House>();
    private HospitalDirectory hospitalList ;

    public Community() {
       this.hospitalList = new HospitalDirectory();
    }

    public Admin getCommunityadmin() {
        return communityadmin;
    }

    public void setCommunityadmin(Admin communityadmin) {
        this.communityadmin = communityadmin;
    }



    public Admin getAdmin() {
        return communityadmin;
    }

    public void setAdmin(Admin communityadmin) {
        this.communityadmin = communityadmin;
    }
   
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
     public House addNewHouse(){
        House newHouse = new House();
        houseList.add(newHouse);
        return newHouse;
    }
     public void deleteHouse(House house){
        this.houseList.remove(house);
    }

    public HospitalDirectory getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(HospitalDirectory hospitalList) {
        this.hospitalList = hospitalList;
    }
     
     
 @Override
    public String toString(){
        return communityName;
    }
   

   
    
    
}
