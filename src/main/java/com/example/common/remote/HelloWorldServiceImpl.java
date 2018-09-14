package com.example.common.remote;

import com.example.common.annotation.RpcService;

@RpcService(HelloWorldService.class) // 指定远程接口
public class HelloWorldServiceImpl implements HelloWorldService {
	public String sayHello(String str){
		 String result = str;
         System.out.println("the hello is == " + result);
         return result;
	}
}
