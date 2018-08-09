package com.qa.account.firstNameCount.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.account.application.management.system.Account;
import com.qa.account.application.management.system.Service;

public class TestNameCount {
	Service service;

	
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
	public void countTest() {
		assertEquals(3,service.countNames("Nathan"));
	}
	
	@Test
	public void countTest2() {
		assertEquals(1,service.countNames("Michael"));
	}

}
