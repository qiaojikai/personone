package designpattern.builder.copy;

//使用Director(AirShipDirector)控制建造过程, 也用它来隔离用户与建造过程的关联:
public class AirShipDirector {

    /**
     * 确定一种稳定的构造过程
     *
     * @param builder
     */
    public static void construct(AirShipBuilder builder) {

        builder.builtEngine();

        builder.builtEscapeTower();

        builder.builtOrbitalModule();
    }
}