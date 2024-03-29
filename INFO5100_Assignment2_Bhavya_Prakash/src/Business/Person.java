/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.Date;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Person {
    
    private static int i = 101;
    private  int personId;
    private String personName;
    private int personAge;
    private String personGender;
    private String personContactNo;
    private String personContactEmail;
    private String personInsurance;
    private String personAddress;
    private House house;
    private Date personDOB;
    private String username;
    private String password;

    public Person(String personName, int personAge, String personGender, String personContactNo, String personContactEmail, String personInsurance, String personAddress, House house, Date personDOB, String username, String password) {
        this.personName = personName;
        this.personAge = personAge;
        this.personGender = personGender;
        this.personContactNo = personContactNo;
        this.personContactEmail = personContactEmail;
        this.personInsurance = personInsurance;
        this.personAddress = personAddress;
        this.house = house;
        this.personDOB = personDOB;
        this.username = username;
        this.password = password;
         this.personId=i;
        i=i+1;
    }

    

    public Person(String personName, int personAge, String personGender, String personContactNo, String personContactEmail, Date personDOB, String personAddress,String username, String password) {
        this.personName = personName;
        this.personAge = personAge;
        this.personGender = personGender;
        this.personContactNo = personContactNo;
        this.personContactEmail = personContactEmail;
        this.personAddress = personAddress;
        this.personDOB = personDOB;
        this.username = username;
        this.password = password;
        this.personInsurance = "not needed";
        this.house = new House();
         this.personId=i;
        i=i+1;
        
    }

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
         this.personId=i;
        i=i+1;
    }
    

    public String getPersonId() {
        return String.valueOf(personId);
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public String getPersonContactNo() {
        return personContactNo;
    }

    public void setPersonContactNo(String personContactNo) {
        this.personContactNo = personContactNo;
    }

    public String getPersonContactEmail() {
        return personContactEmail;
    }

    public void setPersonContactEmail(String personContactEmail) {
        this.personContactEmail = personContactEmail;
    }

    public String getPersonInsurance() {
        return personInsurance;
    }

    public void setPersonInsurance(String personInsurance) {
        this.personInsurance = personInsurance;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Date getPersonDOB() {
        return personDOB;
    }

    public void setPersonDOB(Date personDOB) {
        this.personDOB = personDOB;
    }
    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}