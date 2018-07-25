package designpattern.builder.copy;

class LowerAirShipBuilder implements AirShipBuilder {

    private AirShip airShip = new AirShip();

    @Override
    public void builtEngine() {
        System.out.println("\t\t构造低端引擎");
        airShip.setEngine(new Engine("低端 - 引擎"));
    }

    @Override
    public void builtEscapeTower() {
        System.out.println("\t\t构造低端逃逸塔");
        airShip.setEscapeTower(new EscapeTower("低端 - 逃逸塔"));
    }

    @Override
    public void builtOrbitalModule() {
        System.out.println("\t\t构造低端轨道舱");
        airShip.setOrbitalModule(new OrbitalModule("低端 - 轨道舱"));
    }

    @Override
    public AirShip getResult() {
        return airShip;
    }
}

class HigherAirShipBuilder implements AirShipBuilder {

    private AirShip airShip = new AirShip();

    @Override
    public void builtEngine() {
        System.out.println("\t\t构造高端引擎");
        airShip.setEngine(new Engine("高端 - 引擎"));
    }

    @Override
    public void builtEscapeTower() {
        System.out.println("\t\t构造高端逃逸塔");
        airShip.setEscapeTower(new EscapeTower("高端 - 逃逸塔"));
    }

    @Override
    public void builtOrbitalModule() {
        System.out.println("\t\t构造高端轨道舱");
        airShip.setOrbitalModule(new OrbitalModule("高端 - 轨道舱"));
    }

    @Override
    public AirShip getResult() {
        return airShip;
    }
}