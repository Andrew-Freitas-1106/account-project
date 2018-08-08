package com.qa.account.application.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.qa.account.application.management.system.Account;
import com.qa.account.application.management.system.Service;

public class AppTest {
	
	private Service service;
	
	@Before
	public void setup() {
		
		service = new Service();
		service.addAccount(new Account("Daniel","Bossman","0001"));
		service.addAccount(new Account("Michael","Massey","0002"));
		service.addAccount(new Account("Nathan","Ahrens","0003"));
	}

    
	@Test
    public void testGetFirstName() {
		assertEquals("Michael",service.retrieveAccount(2).getFirstName());
    }	
	
	@Test
	public void testApp() {
		assertEquals("First Name: Michael Last Name: Massey Account Number: 0002", service.retrieveAccount(2).toString());
	}
    
}
