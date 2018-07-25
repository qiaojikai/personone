package designpattern.order;

import org.junit.Test;

public class Client {

    @Test
    public void client() {
        // 开业准备
        WaiterInvoker waiter = new WaiterInvoker();
        CookReceiver cook = new CookReceiver();
        Command backMuttondesignpattern = new BackMuttonCommand(cook);
        Command backChickenWingdesignpattern = new BackChickenWingCommand(cook);

        // 接收订单
        waiter.addCommand(backMuttondesignpattern);
        waiter.addCommand(backChickenWingdesignpattern);

        // 在厨师制作完成之前还可以撤销订单
        waiter.cancelCommand(backMuttondesignpattern);

        // 通知执行
        waiter.notifyExecute();
    }
}