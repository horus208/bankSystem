package com.fyu.dao;

import java.util.List;

import com.fyu.dto.Employee;

public class EmployeeDAO {

	static public void saveEmployee(Employee employee) {
		Database.getInstance().employees.add(employee);
	}

	static public void deleteEmployee(long employeeId) {
		for (Employee employee : Database.getInstance().employees) {
			if (employee.getEmployeeId() == employeeId) {
				Database.getInstance().employees.remove(employee);
				break;
			}

		}
	}

	static public Employee findEmployee(long employeeId) {
		for (Employee employee : Database.getInstance().employees) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}

		}
		return null;
	}

	static public List<Employee> findAll() {
		return Database.getInstance().employees;
	}

}
