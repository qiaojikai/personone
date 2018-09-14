//package com.example.common.remote.rmi;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.remoting.rmi.RmiServiceExporter;
//import org.springframework.stereotype.Component;
//
//import com.example.common.remote.HelloWorldService;
//
//@Component
//public class RmiDemo {
//	@Bean
//	public RmiServiceExporter rmiServiceExporter(HelloWorldService helloWorldService){
//		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
//		rmiServiceExporter.setService(helloWorldService);       //将该bean发布为一个RMI服务
//		rmiServiceExporter.setServiceName("HelloWorldService"); //服务名称
//		rmiServiceExporter.setServiceInterface(HelloWorldService.class);   //此服务所实现的接口
//		return rmiServiceExporter;
//	}
//}
