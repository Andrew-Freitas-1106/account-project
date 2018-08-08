package com.qa.account.application.management.system;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	Map<String,Account> bankAccount;
	
	public Service() {
		bankAccount = new HashMap<>();
	}
	

	public void addAccount(String key, Account account) {
		bankAccount.put(key, account);
		
	}

	public Account retrieveAccount(String key) {
		return bankAccount.get(key);
	}

}
