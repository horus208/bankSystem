package com.fyu.dto;

public class Manager extends Employee {
	private int teamNumber;
	private long managerId;
	
	public Manager(String name, int age, String gender, String ssn, String nationality, String address,
			String social_status, String mail, String phone, double salary, int workingYears, String departmentName, int teamNumber) {
		super (name, age, gender, ssn, nationality, address, social_status, mail, phone, salary, workingYears, departmentName);
		this.teamNumber = teamNumber;
		this.managerId = Employee.id;
		
	}
	
	public long getManagerId() {
		return managerId;
	}
	
	public int getTeamNumber() {
		return teamNumber;
	}

	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}
	
	@Override
	public void raiseSalary() {
		this.salary += this.salary * 0.07;
	}
	

}
