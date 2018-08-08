package com.qa.account.util;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qa.account.application.management.system.Account;

public class JSONConverter {

	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	public String convertToJson(Map<Integer, Account> accountMap) {
		return gson.toJson(accountMap);
	}
	
	public void convertByIdToJson(int id) {
		
	}
	
	public void convertToJava() {
		
	}

}
