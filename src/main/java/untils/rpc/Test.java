package untils.rpc;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
    	HelloWorldService helloWorldService = (HelloWorldService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
           		new Class[]{HelloWorldService.class}, new RPCProxyClient(new HelloWorldServiceImpl()));
//        HelloWorldService helloWorldService = (HelloWorldService)RPCProxyClient.getProxy(HelloWorldService.class);
        helloWorldService.sayHello("test");
    }
}
