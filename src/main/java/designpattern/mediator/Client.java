package designpattern.mediator;

import org.junit.Test;
//中介者模式: 又称调停者模式, 用一个中介者对象(Mediator)来封装一系列对象的交互, 使各对象不需再显示地相互引用, 从而使耦合松散, 而且可以独立地改变他们之间的交互: 
//: 各Colleague只知道Mediator的存在, 并不需要知道其他Colleague是否存在(不然怎么解耦呢), 它只需将消息发送给Mediator,
// 然后由Mediator转发给其他Colleague(由Mediator存储所有Colleague关系, 也只有Mediator知道有多少/哪些Colleague). 
public class Client {

    @Test
    public void client() {
        UnitedNations mediator = new UnitedNationsSecurityCouncil();

        Country usa = new USA(mediator, "美国");
        Country china = new China(mediator, "中国");
        Country iraq = new Iraq(mediator, "伊拉克");

        mediator.register(usa);
        mediator.register(china);
        mediator.register(iraq);

        usa.declare("我要打伊拉克, 谁管我跟谁急!!!");
        System.out.println("----------");
        china.declare("我们强烈谴责!!!");
        System.out.println("----------");
        iraq.declare("来呀, 来互相伤害呀!!!");
    }
}