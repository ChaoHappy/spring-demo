package com.zlc.aop.verify.parameter.xmlconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext-aop-verify.xml"})
public class RegisteredServiceTest {
	@Autowired
	private RegisteredService registeredService;
	
	@Test
	public void testRegistered() {
		String username = "zlc";
		String password = "111111";
		registeredService.registered(username, password);
	}
	
	@Test
	public void testLogin() {
		String username = "zlc";
		String password = "111111";
		registeredService.login(username, password);
	}
}
