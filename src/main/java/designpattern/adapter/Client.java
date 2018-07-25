package designpattern.adapter;

import org.junit.Test;

//将一个类的接口转换成客户希望的另外一个接口. Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作; 
public class Client {

    @Test
    public void client() {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
