package com.fyu.dao;

import java.util.ArrayList;
import com.fyu.dto.*;

public class Database {

	private Database() {};
	
	// create an object of Database
	private static Database instance = new Database();

	public ArrayList<Account> accounts = new ArrayList<>();
	public ArrayList<Customer> customers= new ArrayList<>();
    public ArrayList<Employee> employees= new ArrayList<>();
    public ArrayList<Manager> managers= new ArrayList<>();
	
	public static Database getInstance() {
//		if(instance == null) {
//		instance = new Database();
//		}
		return instance ;
	}
	

}
