package com.zlc.aop.verify.parameter.xmlconfig;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ParameterVerify {
	
	public void beforeMethod(JoinPoint point) {
		System.out.println("=====beforeMethod()=======");
		System.out.println("目标方法名为:" + point.getSignature().getName());
        System.out.println("目标方法所属类的简单类名:" +        point.getSignature().getDeclaringType().getSimpleName());
        System.out.println("目标方法所属类的类名:" + point.getSignature().getDeclaringTypeName());
        System.out.println("目标方法声明类型:" + Modifier.toString(point.getSignature().getModifiers()));
        Object[] args = point.getArgs();
        for (int i = 0; i < args.length; i++) {
        	System.out.println("第" + (i+1) + "个参数为:" + args[i]);
		}
        System.out.println("被代理的对象:" + point.getTarget());
        System.out.println("代理对象自己:" + point.getThis());
	} 
	
	/**
	 * 
	 * @param JoinPoint或者写成ProceedingJoinPoint
	 */
	public void aroundMethod(JoinPoint joinPoint) {
		System.out.println("=====aroundMethod()=======");
		System.out.println("目标方法名为:" + joinPoint.getSignature().getName());
        System.out.println("目标方法所属类的简单类名:" + joinPoint.getSignature().getDeclaringType().getSimpleName());
        System.out.println("目标方法所属类的类名:" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("目标方法声明类型:" + Modifier.toString(joinPoint.getSignature().getModifiers()));
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
        	System.out.println("第" + (i+1) + "个参数为:" + args[i]);
		}
        System.out.println("被代理的对象:" + joinPoint.getTarget());
        System.out.println("代理对象自己:" + joinPoint.getThis());
        System.out.println("====准备调用方法=============");
        MethodInvocationProceedingJoinPoint methodPoint =  (MethodInvocationProceedingJoinPoint)joinPoint;
        Object[] paramArr = new Object[] {"zhagsan","qqqq"};
        try {
			methodPoint.proceed(paramArr);
		} catch (Throwable e) {
			//异常通知
            System.out.println("执行目标方法异常后...");
            throw new RuntimeException(e);
		}
        System.out.println("====结束调用方法=============");
	}
}
