package designpattern.order.copy;

//命令接收者: 提供很多方法调用, 负责执行与请求相关业务逻辑
//厨师: 只负责做各种各样的菜.
public class CookReceiver {

    public void bakeMutton() {
        System.out.println("厨师: 烤羊肉串");
    }

    public void backChickenWing() {
        System.out.println("厨师: 烤鸡翅");
    }
}
