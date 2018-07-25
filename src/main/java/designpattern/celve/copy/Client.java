package designpattern.celve.copy;

import org.junit.Test;

//策略模式: 定义一系列的算法, 将其一个个封装起来, 并使它们可相互替换, 使得算法可独立于使用它的客户而变化. 
//策略模式对应于解决某一问题的一个算法族, 允许用户从该算法族中任选一个算法解决该问题, 
//同时可以方便的更换算法或者增加新的算法. 并由客户端决定调用哪个算法(核心: 分离算法, 选择实现).
public class Client {

    @Test
    public void client() {
        double money = 1000;
        Context context = new Context();
        context.setStrategy(Context.Type.NORMAL);
        System.out.println("原价: [" + context.getResult(money) + "]");


        context.setStrategy(Context.Type.REBATE, 100, 20);
        System.out.println("满100返20: [" + context.getResult(money) + "]");

        context.setStrategy(Context.Type.DISCOUNT, 0.8);
        System.out.println("6折优惠: [" + context.getResult(money) + "]");
    }
}
