package com.zlc.aop.demo;

import java.util.Objects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

	public void before() {
		System.out.println("调用方法之前执行before()方法");
	}

	public void after() {
		System.out.println("调用方法之后执行after()方法");
		
	}

	public void afterReturning() {
		System.out.println("方法返回之后执行afterReturning()方法");
		
	}

	public void afterThrowing() {
		System.out.println("方法抛异常之后执行afterThrowing()方法");
		
	}

	public void around(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("调用方法之前执行around()方法");
			joinpoint.proceed();
			System.out.println("调用方法之后执行around()方法");
		} catch (Throwable e) {
			System.out.println(e);
		}
	}

	public void validateCusNo(String cusNo) throws Exception {
		System.out.println("验证cusNo："+cusNo);
		if(cusNo==null||Objects.equals(cusNo, "")) {
			System.out.println("cusNo参数不能为空");
			throw new Exception("cusNo参数不能为空");
		}
	}

}
