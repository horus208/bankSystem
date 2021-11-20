package com.company;

import java.util.Date;

public class Employee extends Person {
    private double salary;
    private String departmentName;
    static private long id=1;
    private long employeeId=0;


    public Employee(String name, int age, String gender, String ssn, String nationality, String address, String social_status, String mail, String phone,
                    double salary, String departmentName)
    {
        super(name, age, gender, ssn, nationality, address, social_status, mail, phone);
        this.salary = salary;
       // this.workingYears = workingYears;
        this.departmentName = departmentName;
        this.employeeId=id;

        id++;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public long getEmployeeId() {
        return employeeId;
    }
}
