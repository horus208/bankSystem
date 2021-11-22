package com.fyu.dao;

import java.util.List;

import com.fyu.dto.Manager;

public class ManagerDAO {
	static public void saveManager(Manager manager) {
		Database.getInstance().managers.add(manager);
	}

	static public void deleteManager(long managerId) {
		for (Manager manager : Database.getInstance().managers) {
			if (manager.getManagerId() == managerId) {
				Database.getInstance().managers.remove(manager);
				break;
			}

		}
	}

	static public Manager findManager(long managerId) {
		for (Manager manager : Database.getInstance().managers) {
			if (manager.getManagerId() == managerId) {
				return manager;
			}

		}
		return null;
	}

	static public List<Manager> findAll() {
		return Database.getInstance().managers;
	}
}
