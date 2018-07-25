package designpattern.builder.copy;

//Builder(AirShipBuilder)是为创建一个Product对象的各个部件指定的抽象接口, 
//ConcreteBuilder(LowerAirShipBuilder/HigherAirShipBuilder)是具体的建造者, 实现Builder接口, 构造和装配各个部件.
public interface AirShipBuilder {

    void builtEngine();

    void builtEscapeTower();

    void builtOrbitalModule();

    AirShip getResult();
}
