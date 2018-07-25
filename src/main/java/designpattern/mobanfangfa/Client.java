package designpattern.mobanfangfa;

import org.junit.Test;
//模板方法模式： 定义一个操作中的算法的骨架, 而将一些步骤延迟到子类中. 模板方法使得子类可以在不改变一个算法的结构的前提下重定义该算法的某些特定步骤. 
//处理某个流程的骨架代码已经具备, 但其中某节点的具体实现暂不确定, 此时可采用模板方法, 将该节点的代码实现转移给子类完成. 
//即: 处理步骤在父类中定义好, 具体实现延迟到子类中定义.
public class Client {

    @Test
    public void client() {
        AbstractATMBusiness changePassword = new ChangePasswordConcreteATMBusiness();
        changePassword.run();

        AbstractATMBusiness checkOut = new CheckOutConcreteATMBusiness();
        checkOut.run();
    }
}
