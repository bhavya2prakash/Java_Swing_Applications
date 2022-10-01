/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Employee {
    
    private String name;
    private String employeeId;
    private int age;
    private String gender;
    private String startDate;
    private int level;
    private String teamInfo;
    private String positionTitle;
    private int cellPhoneNumber;
    private String email;
    private ImageIcon employeePhoto;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(int cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ImageIcon getEmployeePhoto() {
        return employeePhoto;
    }

    public void setEmployeePhoto(ImageIcon employeePhoto) {
        this.employeePhoto = employeePhoto;
    }

    @Override
    public String toString(){
        return name;
    }
    
}
