package designpattern.agency;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
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
	        
	        //这里可以通过运行结果证明proxyStar是Proxy的一个实例，这个实例实现了Star接口  
	        System.out.println(proxyStar instanceof Proxy);
	        
            //这里可以看出proxyStar的Class类是$Proxy0,这个$Proxy0类继承了Proxy，实现了Star接口  
	        System.out.println("proxyStar的class对象是:" + proxyStar.getClass().toString());
	        
            System.out.print("proxyStar中的属性有：");  
              
            Field[] field=proxyStar.getClass().getDeclaredFields();  
            for(Field f:field){  
                System.out.print(f.getName()+", ");  
            }  
              
            System.out.print("\n"+"proxyStar中的方法有：");  
              
            Method[] method=proxyStar.getClass().getDeclaredMethods();  
              
            for(Method m:method){  
                System.out.print(m.getName()+", ");  
            }  
              
            System.out.println("\n"+"proxyStar的父类是："+proxyStar.getClass().getSuperclass());  
              
            System.out.print("\n"+"proxyStar实现的接口是：");  
              
            Class<?>[] interfaces=proxyStar.getClass().getInterfaces();  
              
            for(Class<?> i:interfaces){  
                System.out.print(i.getName()+", ");  
            }
            
            //Star.clss的构造方法
            System.out.print("\n"+"InvocationHandler.clss的构造方法是：");  
            Constructor[] constructor = InvocationHandler.class.getConstructors();
            for(Constructor<?> c : constructor){
            	System.out.println(c);
            }
//	        Star star = (Star) new ProxyFactory(new StarBeforeAdvice(), new RealStar(), new StarAfterAdvice()).createProxy();
//	        star.singSong();
//
//
            
//            Class cl = getProxyClass(ClassLoader.getSystemClassLoader(), interfaces);
//            System.out.println("c1==="+ c1);
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
