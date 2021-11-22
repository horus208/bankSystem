package com.fyu.dao;

import java.util.List;

import com.fyu.dto.Account;

public class AccountDAO {

	static public void saveAccount(Account account) {
		Database.getInstance().accounts.add(account);
	}

	static public void deleteAccount(long accountId) {
		for (Account account : Database.getInstance().accounts) {
			if (account.getAccountId() == accountId) {
				Database.getInstance().accounts.remove(account);
				break;
			}

		}
	}

	static public Account findAccount(long accountId) {
		for (Account account : Database.getInstance().accounts) {
			if (account.getAccountId() == accountId) {
				return account;
			}

		}
		return null;
	}

	static public List<Account> findAll() {
		return Database.getInstance().accounts;
	}

}