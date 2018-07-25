package designpattern.waiguan.copy;

import org.junit.Test;
//外观模式: 又称门面模式: 外观Facade为子系统的一组接口提供一个一致界面,
//使得这组子系统易于使用(通过引入一个新的外观角色降低原系统复杂度,同时降低客户类与子系统的耦合度). 
//外观类: 知道哪些子系统负责处理请求, 将客户的请求代理给适当的子系统对象:
public class Client {

    @Test
    public void client() {
        MediumFacade facade = new MediumFacade();
        facade.rentingHouse(800);
    }
}
