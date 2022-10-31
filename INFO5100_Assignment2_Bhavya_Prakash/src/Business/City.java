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
public class City {
    
    private String cityName;
    private ArrayList<Community> communityList ;
    
    public City() {
       
        this.communityList = new ArrayList<>();
    }
    public City(String cityName) {
        this.cityName = cityName;
        this.communityList = new ArrayList<>();
    }
    
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    

     public Community addNewCommunity(){
        Community newCommunity = new Community();
        communityList.add(newCommunity);
        return newCommunity;
    }
     public void deleteCommunity(Community community){
        this.communityList.remove(community);
    }
    
     @Override
    public String toString(){
        return cityName;
    }
    
}
