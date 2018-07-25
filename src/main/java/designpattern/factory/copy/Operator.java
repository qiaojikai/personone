package designpattern.factory.copy;

public interface Operator<T> {
    T getResult(T... args);
}
