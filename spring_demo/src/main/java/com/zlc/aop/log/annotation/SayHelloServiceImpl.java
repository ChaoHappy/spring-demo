package com.zlc.aop.log.annotation;

import org.springframework.stereotype.Service;

@Service
public class SayHelloServiceImpl implements SayHelloService {

	@LogRecord(recordName = "˵������")
	public void saySomething(String content) {
		System.out.println("˵�����ݣ�"+content);
	}

}
