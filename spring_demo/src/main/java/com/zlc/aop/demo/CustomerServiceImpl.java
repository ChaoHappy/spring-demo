package com.zlc.aop.demo;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	public void save() throws Exception {
		System.out.println("保存客户资料");
		throw new Exception("ssss");
	}

	public void saveCusNo(String cusNo) {
		System.out.println("保存客户卡号："+cusNo);
	}
}
