package com.zlc.aop.verify.parameter.xmlconfig;

import org.springframework.stereotype.Component;

@Component("registeredService")
public class RegisteredServiceImpl implements RegisteredService {
	public void registered(String username,String password) {
		System.out.println("ע��ɹ����˺ţ�"+username+"�����룺"+password);
	}

	public void login(String username, String password) {
		System.out.println("�û���"+username+"����¼�ɹ���");
	}
}
