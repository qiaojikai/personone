package designpattern.builder;

//完全不需知道具体的创建/装配过程, 只需指定Builder:
import org.junit.Test;

public class Client {

    @Test
    public void client() {
        AirShipBuilder lowBuilder = new LowerAirShipBuilder();
        // 构造低端飞船
        AirShipDirector.construct(lowBuilder);
        AirShip lowShip = lowBuilder.getResult();
        System.out.println(lowShip);

//        AirShipBuilder highBuilder = new HigherAirShipBuilder();
//        // 相同的构造过程, 不同的Builder, 可以构造出不同的飞船
//        AirShipDirector.construct(highBuilder);
//        AirShip highShip = highBuilder.getResult();
//        System.out.println(highShip);
    }
}