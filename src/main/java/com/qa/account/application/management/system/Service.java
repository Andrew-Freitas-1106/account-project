package com.qa.account.application.management.system;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<Integer,Account> bankAccount;

	public Service() {
		bankAccount = new HashMap<>();
	}
	
	public void addAccount(Integer key, Account account) {
		bankAccount.put(key, account);
	}

	public Account retrieveAccount(Integer key) {
		return bankAccount.get(key);
	}
	
	public Map<Integer, Account> getBankAccount() {
		return bankAccount;
	}
	
	public void setBankAccount(Map<Integer, Account> bankAccount) {
		this.bankAccount = bankAccount;
	}

}

