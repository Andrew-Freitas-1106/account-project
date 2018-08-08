package com.qa.account.application;

import com.qa.account.application.management.system.Account;
import com.qa.account.application.management.system.Service;

/**
 * Hello world!
 *
 */

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hello world to the standard out");
		
		final Account account1 = new Account("Daniel","Bossman","0001");
		final Account account2 = new Account("Michael","Massey","0002");
		final Account account3 = new Account("Nathan","Ahrens","0003");
		
		Service service = new Service();
		service.add("1", account1);
		service.add("2", account2);
		service.add("3", account3);
		
		System.out.println(service.retrieve("2"));
	}

}
