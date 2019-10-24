package com.zlc.aop.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class CustomerTest {
	
	@Autowired
	private CustomerService customerService;
	
	@Test
	public void testCustomerSave() throws Exception {
		customerService.save();
	}
	
	@Test
	public void testSaveCusNo() {
		try {
			customerService.saveCusNo("");
		} catch (Exception e) {
			System.out.println("junit TEST :"+ e);
		}
	}
	
}
