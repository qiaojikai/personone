package designpattern.observe;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers = new LinkedList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected abstract void notifyObservers();

    public abstract String getState();

    public abstract void setState(String state);
}
