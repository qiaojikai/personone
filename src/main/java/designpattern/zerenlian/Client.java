package designpattern.zerenlian;

import org.junit.Test;
//责任链模式: 将能够处理某一类请求的对象串成一条链, 请求沿链传递, 
//链上的对象逐个判断是否有能力处理该请求. 使多个对象都有机会处理请求, 从而避免请求发送者和接收者之间的耦合关系. 
//优势: 发出请求的客户端并不知道链上的哪个对象最终处理该请求, 这使得系统可以在不影响客户端的前提下动态地重新组织和分配责任
public class Client {

    @Test
    public void client() {
        Leader generalManger = new GeneralManager(null, "刘备"); //总经理
        Leader manager = new Manager(generalManger, "诸葛亮"); //经理
        Leader director = new Director(manager, "赵云"); //总监

        director.handle(new Request("请假", "翡青", 32));
        director.handle(new Request("涨薪", "zjf", 1500));
    }
}