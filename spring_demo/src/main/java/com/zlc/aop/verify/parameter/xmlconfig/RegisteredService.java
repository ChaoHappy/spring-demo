package com.zlc.aop.verify.parameter.xmlconfig;

public interface RegisteredService {
	void registered(String username,String password);
	
	void login(String username,String password);
}
