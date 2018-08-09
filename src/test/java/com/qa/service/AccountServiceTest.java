package com.qa.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.domain.Account;
import com.qa.service.Service;

public class AccountServiceTest {
	private Service service;

	
	@Before
	public void setup() {
		service = new Service();
		service.addAccount(new Account("Daniel","Bossman","0001"));
		service.addAccount(new Account("Michael","Massey","0002"));
		service.addAccount(new Account("Nathan","Ahrens","0003"));
		service.addAccount(new Account("Nathan","Jack","0004"));
		service.addAccount(new Account("Nathan","Owens","0005"));
	}
	
	@Test
    public void testGetFirstName() {
		assertEquals("Michael",service.retrieveAccount(1).getFirstName());
    }
	
	@Test
	public void testGetLastName() {
		assertEquals("Jack",service.retrieveAccount(3).getLastName());
	}
	
	@Test
	public void testGetAccountNumber() {
		assertEquals("0005",service.retrieveAccount(4).getAccountNumber());
	}

	@Test
	public void countTest() {
		assertEquals(3,service.countNames("Nathan"));
	}
	
	@Test
	public void countTest2() {
		assertEquals(1,service.countNames("Michael"));
	}

}
