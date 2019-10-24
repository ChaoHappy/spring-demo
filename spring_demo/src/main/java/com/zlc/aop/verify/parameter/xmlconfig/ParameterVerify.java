package com.zlc.aop.verify.parameter.xmlconfig;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class ParameterVerify {
	
	public void beforeMethod(JoinPoint point) {
		System.out.println("=====beforeMethod()=======");
		System.out.println("Ŀ�귽����Ϊ:" + point.getSignature().getName());
        System.out.println("Ŀ�귽��������ļ�����:" +        point.getSignature().getDeclaringType().getSimpleName());
        System.out.println("Ŀ�귽�������������:" + point.getSignature().getDeclaringTypeName());
        System.out.println("Ŀ�귽����������:" + Modifier.toString(point.getSignature().getModifiers()));
        Object[] args = point.getArgs();
        for (int i = 0; i < args.length; i++) {
        	System.out.println("��" + (i+1) + "������Ϊ:" + args[i]);
		}
        System.out.println("������Ķ���:" + point.getTarget());
        System.out.println("��������Լ�:" + point.getThis());
	} 
	
	/**
	 * 
	 * @param JoinPoint����д��ProceedingJoinPoint
	 */
	public void aroundMethod(JoinPoint joinPoint) {
		System.out.println("=====aroundMethod()=======");
		System.out.println("Ŀ�귽����Ϊ:" + joinPoint.getSignature().getName());
        System.out.println("Ŀ�귽��������ļ�����:" + joinPoint.getSignature().getDeclaringType().getSimpleName());
        System.out.println("Ŀ�귽�������������:" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("Ŀ�귽����������:" + Modifier.toString(joinPoint.getSignature().getModifiers()));
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
        	System.out.println("��" + (i+1) + "������Ϊ:" + args[i]);
		}
        System.out.println("������Ķ���:" + joinPoint.getTarget());
        System.out.println("��������Լ�:" + joinPoint.getThis());
        System.out.println("====׼�����÷���=============");
        MethodInvocationProceedingJoinPoint methodPoint =  (MethodInvocationProceedingJoinPoint)joinPoint;
        Object[] paramArr = new Object[] {"zhagsan","qqqq"};
        try {
			methodPoint.proceed(paramArr);
		} catch (Throwable e) {
			//�쳣֪ͨ
            System.out.println("ִ��Ŀ�귽���쳣��...");
            throw new RuntimeException(e);
		}
        System.out.println("====�������÷���=============");
	}
}
