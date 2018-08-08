package com.qa.account.application.management.system;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private int counter = 0;
	private Map<Integer,Account> bankAccount;

	public Service() {
		bankAccount = new HashMap<>();
	}
	  
	public void addAccount(Account account) {
		bankAccount.put(counter, account);
		counter++;
	}

	public Account retrieveAccount(int key) {
		return bankAccount.get(key);
	}
	
	public Map<Integer, Account> getBankAccount() {
		return bankAccount;
	}
	
	public void setBankAccount(Map<Integer, Account> bankAccount) {
		this.bankAccount = bankAccount;
	}

}

