package com.qa.application;

import java.util.Map;

import com.qa.account.util.JSONConverter;
import com.qa.domain.Account;
import com.qa.service.Service;


public class App {

	public static void main(String[] args) {

		Service service = new Service();
		service.addAccount(new Account("Daniel","Bossman","0001"));
		service.addAccount(new Account("Michael","Massey","0002"));
		service.addAccount(new Account("Nathan","Ahrens","0003"));
		
		Map<Integer, Account> accountMap = service.getBankAccount();
		JSONConverter converter = new JSONConverter();
		String jsonString = converter.convertToJson(accountMap);
		System.out.println("This is the value of jsonString " + jsonString);
	 
	}

}

