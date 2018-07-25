package designpattern.zhuangtai;

public class Context {

    private State current;

    public Context(State current) {
        this.current = current;
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public void request() {
        if (current != null) {
            current.handle(this);
        }
    }
}