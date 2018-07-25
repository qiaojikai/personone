package designpattern.zhuangtai.copy;

import org.junit.Test;
//状态模式: 允许一个对象在其内部状态改变时改变其行为, 其对象看起来像是改变了其类. 
//其目的是: 解决系统中复杂对象的状态流转以及不同状态下的行为封装问题.
public class Client {

    @Test
    public void client() {
        Context context = new Context(NewState.instance());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
