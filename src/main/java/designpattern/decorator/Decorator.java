package designpattern.decorator;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public abstract void operator();
}

class BeforeAdviceDecorator extends Decorator {

    public BeforeAdviceDecorator(Component component) {
        super(component);
    }

    @Override
    public void operator() {
        System.out.println(" -> 前置增强");
        this.component.operator();
    }
}

class AfterAdviceDecorator extends Decorator {

    public AfterAdviceDecorator(Component component) {
        super(component);
    }

    @Override
    public void operator() {
        this.component.operator();

        System.out.println("后置增强 -> ");
    }
}
