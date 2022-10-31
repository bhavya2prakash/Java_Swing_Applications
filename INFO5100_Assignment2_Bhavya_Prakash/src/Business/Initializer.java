/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Initializer {
    public static SystemClass initialize(){
        SystemClass system = new SystemClass();
        City city1= new City("Boston");
        City city2= new City("Cambridge");
        City city3= new City("Lowell");
        system.cityList.addNewwCity(city1);
        system.cityList.addNewwCity(city2);
        system.cityList.addNewwCity(city3);
        Community community1 = city1.addNewCommunity();
        community1.setCommunityName("Alliston");
        Person person1 = new Person("communityone","communityone");
        Admin communityAdmin1 = new Admin(community1,person1);
        community1.setAdmin(communityAdmin1);
        House house1 = community1.addNewHouse(); 
        house1.setHouseName("69 Quint Ave,Zipcode:02134");
        House house2 = community1.addNewHouse(); 
        house2.setHouseName("26 Windom St,Zipcode:02134");
        House house3 = community1.addNewHouse(); 
        house3.setHouseName("1 highgate St,Zipcode:02134");
        Community community2 = city1.addNewCommunity();
        community2.setCommunityName("Back Bay");
        Person person2 = new Person("communitytwo","communitytwo");
        Admin communityAdmin2 = new Admin(community2,person2);
        community2.setAdmin(communityAdmin2);
        House house4 = community2.addNewHouse(); 
        house4.setHouseName("352 Marlborough St,Zipcode:02115");
        House house5 = community2.addNewHouse(); 
        house5.setHouseName("160 Beacon St Apt 1,Zipcode:02116");
        House house6 = community2.addNewHouse(); 
        house6.setHouseName("16 Harcourt St Apt 41,Zipcode:02116");
        Community community3 = city1.addNewCommunity();
        community3.setCommunityName("North End");
        Person person3 = new Person("communitythree","communitythree");
        Admin communityAdmin3 = new Admin(community3,person3);
        community3.setAdmin(communityAdmin3);
        House house7 = community3.addNewHouse(); 
        house7.setHouseName("101 Prince St Apt 2,Zipcode:02113");
        House house8 = community3.addNewHouse(); 
        house8.setHouseName("19 Harris St,Zipcode:02109");
        House house9 = community3.addNewHouse(); 
        house9.setHouseName("204 Endicott St,Zipcode:02113");
        Community community4 = city2.addNewCommunity();
        community4.setCommunityName("Harvard Square");
        Person person4 = new Person("communityfour","communityfour");
        Admin communityAdmin4 = new Admin(community4,person4);
        community4.setAdmin(communityAdmin4);
        House house10 = community4.addNewHouse(); 
        house10.setHouseName("989 Memorial Dr Apt 392,Zipcode:02138");
        House house11 = community4.addNewHouse(); 
        house11.setHouseName("975 Memorial Dr Apt 906,Zipcode:02138");
        House house12 = community4.addNewHouse(); 
        house12.setHouseName("970 Memorial Dr Apt 906,Zipcode:02138");
        Community community5 = city2.addNewCommunity();
        community5.setCommunityName("Riverside");
        Person person5 = new Person("communityfive","communityfive");
        Admin communityAdmin5 = new Admin(community5,person5);
        community5.setAdmin(communityAdmin5);
        House house13 = community5.addNewHouse(); 
        house13.setHouseName("6 Jay St Unit 6,Zipcode:02139");
        House house14 = community5.addNewHouse(); 
        house14.setHouseName("356 Western Ave,Zipcode:02139");
        House house15 = community5.addNewHouse(); 
        house15.setHouseName("28 Jay St,Zipcode:02139");
        Community community6 = city2.addNewCommunity();
        community6.setCommunityName("Peabody");
        Person person6 = new Person("communitysix","communitysix");
        Admin communityAdmin6 = new Admin(community6,person6);
        community6.setAdmin(communityAdmin6);
        House house16 = community6.addNewHouse(); 
        house16.setHouseName("261 Newbury St Unit 17A,Zipcode:01960");
        House house17 = community6.addNewHouse(); 
        house17.setHouseName("3B County St Unit B,Zipcode:01960");
        House house18 = community6.addNewHouse(); 
        house18.setHouseName("5 Tara Rd, Zipcode:01960");
        Community community7 = city3.addNewCommunity();
        community7.setCommunityName("Belvidere");
        Person person7 = new Person("communityseven","communityseven");
        Admin communityAdmin7 = new Admin(community7,person7);
        community7.setAdmin(communityAdmin7);
        House house19 = community7.addNewHouse(); 
        house19.setHouseName("22 Mansion Dr,Zipcode:01852");
        House house20 = community7.addNewHouse(); 
        house20.setHouseName("138 Chestnut St Apt 2,Zipcode:01852");
        House house21 = community7.addNewHouse(); 
        house21.setHouseName("10 Mansur St,Zipcode:01852");
        Community community8 = city3.addNewCommunity();
        community8.setCommunityName("Centralville");
        Person person8 = new Person("communityeight","communityeight");
        Admin communityAdmin8 = new Admin(community8,person8);
        community8.setAdmin(communityAdmin8);
         House house22 = community8.addNewHouse(); 
        house22.setHouseName("149 11th St,Zipcode:01850");
        House house23 = community8.addNewHouse(); 
        house23.setHouseName("73 4th St,Zipcode:01850");
        House house24 = community8.addNewHouse(); 
        house24.setHouseName("202 Humphrey St,Zipcode:01850");
        Community community9 = city3.addNewCommunity();
        community9.setCommunityName("Downtown");
        Person person9 = new Person("communitynine","communitynine");
        Admin communityAdmin9 = new Admin(community9,person9);
        community9.setAdmin(communityAdmin9);
        House house25 = community9.addNewHouse(); 
        house25.setHouseName("61 Market St Unit 3D,Zipcode:01852");
        House house26 = community9.addNewHouse(); 
        house26.setHouseName("200 Market St Unit 3316,Zipcode:01852");
        House house27 = community9.addNewHouse(); 
        house27.setHouseName("172 Middle St Apt 405,Zipcode:01852");
        
        
        return system;
        
    }
    
}
