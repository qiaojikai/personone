package designpattern.bridge;

import org.junit.Test;

//桥接模式
public class Client {

    @Test
    public void test() {
//        Computer computer = new Desktop(new Dell());
//        computer.sale();
        
        Computer computer = new Smartphone(new Lenovo());
        computer.sale();
    }
}
