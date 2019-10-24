package com.zlc.aop.verify.parameter.xmlconfig;

import org.springframework.stereotype.Component;

@Component("registeredService")
public class RegisteredServiceImpl implements RegisteredService {
	public void registered(String username,String password) {
		System.out.println("注册成功，账号："+username+"；密码："+password);
	}

	public void login(String username, String password) {
		System.out.println("用户："+username+"；登录成功。");
	}
}
