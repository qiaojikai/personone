package designpattern.mediator;

public abstract class Country {

    protected UnitedNations mediator;

    private String name;

    public Country(UnitedNations mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract void declare(String msg);

    protected abstract void receive(String msg);
}
