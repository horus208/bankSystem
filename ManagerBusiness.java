package com.fyu.bao;

import com.fyu.dao.AccountDAO;
import com.fyu.dao.CustomerDAO;
import com.fyu.dao.EmployeeDAO;
import com.fyu.dao.ManagerDAO;
import com.fyu.dto.Account;
import com.fyu.dto.Customer;
import com.fyu.dto.Employee;
import com.fyu.dto.Manager;

public class ManagerBusiness {

	public static void newManager(String name, int age, String gender, String ssn, String nationality, String address,
			String social_status, String mail, String phone, double salary, int workingYears, String departmentName,
			int teamNumber) {
		Manager manager = new Manager(name, age, gender, ssn, nationality, address, social_status, mail, phone, salary,
				workingYears, departmentName, teamNumber);
		ManagerDAO.saveManager(manager);
	}

	public static void removeManager(long managerId) {
		ManagerDAO.deleteManager(managerId);
	}

	public static void raiseManagerSalary(long managerId) {
		Manager manager = ManagerDAO.findManager(managerId);
		manager.raiseSalary();
	}

	public static Manager getManagerInfo(long managerId) {
		return ManagerDAO.findManager(managerId);
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
