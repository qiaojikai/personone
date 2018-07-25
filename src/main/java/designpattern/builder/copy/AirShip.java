package designpattern.builder.copy;
/**
 * 目标对象 - 宇宙飞船
 * (代表复杂对象, 拥有复杂的建造过程)
 * 
 */
public class AirShip {

    private Engine engine; //引擎

    private EscapeTower escapeTower; //逃逸塔

    private OrbitalModule orbitalModule; //轨道舱

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    @Override
    public String toString() {
        return "AirShip{" +
                "engine=" + engine +
                ", escapeTower=" + escapeTower +
                ", orbitalModule=" + orbitalModule +
                '}';
    }
}

class Engine {

    private String description;

    public Engine(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "description='" + description + '\'' +
                '}';
    }
}

class EscapeTower {

    private String description;

    public EscapeTower(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EscapeTower{" +
                "description='" + description + '\'' +
                '}';
    }
}

class OrbitalModule {

    private String description;

    public OrbitalModule(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OrbitalModule{" +
                "description='" + description + '\'' +
                '}';
    }
}
