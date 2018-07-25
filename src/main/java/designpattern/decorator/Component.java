package designpattern.decorator;

public interface Component {

    void operator();
}

class ConcreteComponent implements Component {

    @Override
    public void operator() {
        System.out.println("具体对象" + this.toString() + "的操作");
    }
}
