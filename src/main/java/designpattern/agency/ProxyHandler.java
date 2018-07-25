package designpattern.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Star star;

    public ProxyHandler(Star star) {
        this.star = star;
    }

    /**
     * 代理对象的实现的所有接口中的方法, 内容都是调用invoke方法
     *
     * @param proxy  代理对象(Proxy.newProxyInstance返回的对象)
     * @param method 当前被调的方法
     * @param args   执行当前方法的参数
     * @return 执行方法method的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("签约");
        Object result = null;
        if (method.getName().equals("singSong")) {
            result = method.invoke(star, args);
        }
        System.out.println("收款");
        return result;
    }
}