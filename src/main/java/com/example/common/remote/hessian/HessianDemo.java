package com.example.common.remote.hessian;

import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Component;

import com.example.common.remote.HelloWorldService;

@Component
public class HessianDemo {
	
	@Bean(name="/helloServer")
	public HessianServiceExporter hessianServiceExporter(HelloWorldService helloWorldService){
		HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();
		hessianServiceExporter.setService(helloWorldService);
		hessianServiceExporter.setServiceInterface(HelloWorldService.class);
		return hessianServiceExporter;
	}
	
//	@Bean
//	public HandlerMapping hessianMapping(){
//		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
//		Properties mappings = new Properties();
//		mappings.setProperty("/roleServer","hessianServiceExporter");
//		mapping.setMappings(mappings);
//		return mapping;
//	}
}
