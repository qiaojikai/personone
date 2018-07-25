package designpattern.observe.copy;

import org.junit.Test;
//观察者模式: 又称‘发布-订阅’模式, 定义一种对象间的一对多依赖关系(多个观察者Observer监听某一主题Subject).
//当主题状态发生改变时,所有依赖它的对象都得到通知并被自动更新. 
public class Client {

    @Test
    public void client() {
        Subject subject = new OrderSubject();

        Observer payObserver = new PayObserver();//
        Observer relationObserver = new RelationObserver();
        Observer wareHouseObserver = new WareHouseObserver();

        // 注册到Subject
        subject.attach(payObserver);
        subject.attach(relationObserver);
        subject.attach(wareHouseObserver);

        subject.setState("已付款");

        System.out.println("-------------");
        // 付钱、发货完成
        subject.detach(payObserver);
        subject.detach(wareHouseObserver);

        subject.setState("取消订单");
    }
}
