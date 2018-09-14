package personone;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.common.remote.HelloWorldService;
import com.example.common.remote.rpc.client.RpcProxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml"})
public class HelloServiceTest {
 
    @Autowired
    private RpcProxy rpcProxy;
 
    @Test
    public void helloTest() {
    	System.out.println("rpcProxy=="+rpcProxy);
        HelloWorldService helloService = rpcProxy.create(HelloWorldService.class);
        String result = helloService.sayHello("World");
        System.out.println("result=="+result);
        Assert.assertEquals("Hello! World", result);
    }
}