package com.zlc.aop.demo;

import org.aspectj.lang.ProceedingJoinPoint;

public interface LoggerService {
	
	void after() ;
	
	void afterReturning();
	
	void afterThrowing();
	
	void around(ProceedingJoinPoint joinpoint);
	
	void before();
	
	void validateCusNo(String cusNo) throws Exception;

}
