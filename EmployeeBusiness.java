package com.fyu.bao;

import com.fyu.dao.AccountDAO;
import com.fyu.dao.CustomerDAO;
import com.fyu.dao.EmployeeDAO;
import com.fyu.dto.Account;
import com.fyu.dto.Customer;
import com.fyu.dto.Employee;

public class EmployeeBusiness {

	public static void newEmployee(String name, int age, String gender, String ssn, String nationality, String address,
			String social_status, String mail, String phone, double salary, int workingYears, String departmentName) {
		Employee employee = new Employee(name, age, gender, ssn, nationality, address, social_status, mail, phone,
				salary, workingYears, departmentName);
		EmployeeDAO.saveEmployee(employee);
	}

	public static void removeEmployee(long employeeId) {
		EmployeeDAO.deleteEmployee(employeeId);
	}

	public static void raiseEmployeeSalary(long employeeId) {
		Employee employee = EmployeeDAO.findEmployee(employeeId);
		employee.raiseSalary();
	}

	public static Employee getEmployeeInfo(long employeeId) {
		return EmployeeDAO.findEmployee(employeeId);
	}

	public static Account getAccountInfo(long accountId) {
		return AccountDAO.findAccount(accountId);
	}

	public static Customer getCustomerInfo(long customerId) {
		return CustomerDAO.findCustomer(customerId);
	}

}
