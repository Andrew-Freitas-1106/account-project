package com.qa.account.application;

import com.qa.account.application.management.system.Account;
import com.qa.account.application.management.system.Service;


public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello world to the standard out");
		
		Service service = new Service();
		service.addAccount("1", new Account("Daniel","Bossman","0001"));
		service.addAccount("2", new Account("Michael","Massey","0002"));
		service.addAccount("3", new Account("Nathan","Ahrens","0003"));
		
		System.out.println(service.retrieveAccount("1").toString());
	}

}
