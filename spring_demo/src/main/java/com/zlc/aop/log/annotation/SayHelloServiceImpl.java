package com.zlc.aop.log.annotation;

import org.springframework.stereotype.Service;

@Service
public class SayHelloServiceImpl implements SayHelloService {

	@LogRecord(recordName = "说点事情")
	public void saySomething(String content) {
		System.out.println("说的内容："+content);
	}

}
