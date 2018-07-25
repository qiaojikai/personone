package designpattern.decorator;

import org.junit.Test;
//装饰者模式(Decorator): 又称包装器(Wrapper), 可以动态地为一个对象添加一些额外的职责. 就增加功能来说, 
//装饰者模式是一种用于替代继承的技术, 他无须通过增加子类继承就能扩展对象的已有功能, 而是使用对象的关联关系代替继承关系 , 更加灵活, 同时还可避免类型体系的快速膨胀.
public class Client {

    @Test
    public void client() {

        // 裸Component
        Component component = new ConcreteComponent();
        component.operator();


        // 前置增强
        component = new BeforeAdviceDecorator(component);
        component.operator();

        // + 后置增强
        component = new AfterAdviceDecorator(component);
        component.operator();
    }
}
