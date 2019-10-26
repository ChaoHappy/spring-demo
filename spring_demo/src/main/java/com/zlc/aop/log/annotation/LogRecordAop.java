package com.zlc.aop.log.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogRecordAop {
	
	@Pointcut("@annotation(com.zlc.aop.log.annotation.LogRecord)")
	public void anyMethod() {
	}
	
	@Before(value = "anyMethod()")
	public void before() {
		System.out.println("调用方法之前记录日志");
	}
}
