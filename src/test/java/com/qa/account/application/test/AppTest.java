package com.qa.account.application.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.qa.account.application.*;
import com.qa.account.application.management.system.Service;

public class AppTest {
	
	Service service = new Service();
	
    
	@Test
    public void testApp() {
		
        assertEquals("First Name: Michael Last Name: Massey Account Number: 0002", System.out.println(service.retrieve("2")));
    }

	
    
}
