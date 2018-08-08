package com.qa.account.application;

import java.util.Map;

import com.qa.account.application.management.system.Account;
import com.qa.account.application.management.system.Service;
import com.qa.account.util.JSONConverter;


public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello world to the standard out");
		
		Service service = new Service();
		service.addAccount(1, new Account("Daniel","Bossman","0001"));
		service.addAccount(2, new Account("Michael","Massey","0002"));
		service.addAccount(3, new Account("Nathan","Ahrens","0003"));
		
		Map<Integer, Account> accountMap = service.getBankAccount();
		JSONConverter converter = new JSONConverter();
		String jsonString = converter.convertToJson(accountMap);
		System.out.println("This is the value of jsonString " + jsonString);
	 
	}

}

