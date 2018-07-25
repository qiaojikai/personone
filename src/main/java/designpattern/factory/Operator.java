package designpattern.factory;

public interface Operator<T> {
    T getResult(T... args);
}
