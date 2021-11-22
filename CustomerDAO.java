package com.fyu.dao;

import java.util.List;

import com.fyu.dao.CustomerDAO;
import com.fyu.dto.Customer;

public class CustomerDAO {

	static public void saveCustomer(Customer customer) {
		Database.getInstance().customers.add(customer);
	}

	static public void deleteCustomer(long customerId) {
		for (Customer customer : Database.getInstance().customers) {
			if (customer.getCustomerId() == customerId) {
				Database.getInstance().customers.remove(customer);
				break;
			}

		}
	}

	static public Customer findCustomer(long customerId) {
		for (Customer customer : Database.getInstance().customers) {
			if (customer.getCustomerId() == customerId) {
				return customer;
			}

		}
		return null;
	}

	static public List<Customer> findAll() {
		return Database.getInstance().customers;
	}

}
