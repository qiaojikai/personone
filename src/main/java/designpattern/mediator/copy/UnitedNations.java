package designpattern.mediator.copy;

import java.util.LinkedList;
import java.util.List;

public abstract class UnitedNations {

    protected List<Country> countries = new LinkedList<Country>();

    public void register(Country country) {
        countries.add(country);
    }

    public void remove(Country country) {
        countries.remove(country);
    }

    protected abstract void declare(Country country, String msg);
}
