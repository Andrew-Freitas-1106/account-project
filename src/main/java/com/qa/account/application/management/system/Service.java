package com.qa.account.application.management.system;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<String,Account> bankAccount;
	
	public Service() {
		bankAccount = new HashMap<>();
	}
	

	public void add(String key, Account account) {
		bankAccount.put(key, account);
		
	}

	public Account retrieve(String key) {
		return bankAccount.get(key);
	}

}
