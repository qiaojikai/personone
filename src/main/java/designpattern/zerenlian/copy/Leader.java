package designpattern.zerenlian.copy;


public abstract class Leader {

    protected Leader superior;

    protected String name;

    protected Leader(Leader superior, String name) {
        this.superior = superior;
        this.name = name;
    }

    public abstract void handle(Request request);
}
