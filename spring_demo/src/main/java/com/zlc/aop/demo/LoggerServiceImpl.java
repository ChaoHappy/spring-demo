package com.zlc.aop.demo;

import java.util.Objects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

	public void before() {
		System.out.println("���÷���֮ǰִ��before()����");
	}

	public void after() {
		System.out.println("���÷���֮��ִ��after()����");
		
	}

	public void afterReturning() {
		System.out.println("��������֮��ִ��afterReturning()����");
		
	}

	public void afterThrowing() {
		System.out.println("�������쳣֮��ִ��afterThrowing()����");
		
	}

	public void around(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("���÷���֮ǰִ��around()����");
			joinpoint.proceed();
			System.out.println("���÷���֮��ִ��around()����");
		} catch (Throwable e) {
			System.out.println(e);
		}
	}

	public void validateCusNo(String cusNo) throws Exception {
		System.out.println("��֤cusNo��"+cusNo);
		if(cusNo==null||Objects.equals(cusNo, "")) {
			System.out.println("cusNo��������Ϊ��");
			throw new Exception("cusNo��������Ϊ��");
		}
	}

}
