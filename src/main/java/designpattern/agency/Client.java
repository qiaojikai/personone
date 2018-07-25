package designpattern.agency;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class Client {

    @Test
    public void client() {
//        Star star = new StaticProxy(new RealStar());
//        star.signContract();
//        star.singSong();
//        star.collectMoney();
    	
        /**
         * newProxyInstance方法会动态生成一个代理类, 他实现了Star接口, 然后创建该类的对象.
         *
         * 三个参数
         * 1. ClassLoader: 生成一个类, 这个类也需要加载到方法区中, 因此需要指定ClassLoader来加载该类
         * 2. Class[] interfaces: 要实现的接口
         * 3. InvocationHandler: 调用处理器
         */
	        Star proxyStar = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
	        		new Class[]{Star.class}, new ProxyHandler(new RealStar()));
	        proxyStar.singSong();
    	
    	
//	        Star star = (Star) new ProxyFactory(new StarBeforeAdvice(), new RealStar(), new StarAfterAdvice()).createProxy();
//	        star.singSong();
//
//
    }
//    
//	    /**
//	     * BeforeAdvice实现可定制化
//	     */
//	    private static class StarBeforeAdvice implements BeforeAdvice {
//	
//	        @Override
//	        public void before() {
//	            System.out.println("签合约");
//	        }
//	    }
//	
//	    /**
//	     * AfterAdvice实现可定制化
//	     */
//	    private static class StarAfterAdvice implements AfterAdvice {
//	
//	        @Override
//	        public void after() {
//	            System.out.println("收款");
//	        }
//	    }
}
