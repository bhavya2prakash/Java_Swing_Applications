/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> employeeList ;
    
    public EmployeeHistory(){
        this.employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        employeeList.add(newEmployee);
        return newEmployee;
    }
    
}
