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
public class CityCatalogue {
    private ArrayList<City> cityList ;

    public CityCatalogue() {
        this.cityList = new ArrayList<>();
    }

    public ArrayList<City> getCitytList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    public City addNewCity(){
        City newCity = new City();
        cityList.add(newCity);
        return newCity;
    }
     public void deleteCity(City city){
        cityList.remove(city);
    }
    
}
