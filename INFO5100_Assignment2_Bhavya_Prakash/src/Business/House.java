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
public class House {
    
    String houseName;
    String zipcode;
    
   
    
     public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    @Override
    public String toString(){
        return houseName;
    }
    

//  public static void main(String args[]){
//     City city = new City();
//     city.setCityName("delhi");
//     Community community = city.addNewCommunity();
//     community.setCommunityName("com1");
//     Community community2 = city.addNewCommunity();
//     community2.setCommunityName("com2");
//     House house = community.addNewHouse();
//     house.setHouseName("house1");
//     House house2 = community.addNewHouse();
//     house2.setHouseName("house2");
//     System.out.println(city.getCityName());
//     for (Community cm : city.getCommunityList()){
//            
//            for (House hm : cm.getHouseList())
//            {
//                System.out.println(cm.getCommunityName());
//                System.out.println(hm.getHouseName());
//            }
//            
//            
//             
//         }
     
//  }  
    
}
