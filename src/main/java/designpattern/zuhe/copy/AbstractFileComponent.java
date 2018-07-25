package designpattern.zuhe.copy;

public abstract class AbstractFileComponent {

    protected String name;

    protected AbstractFileComponent(String name) {
        this.name = name;
    }

    protected void printDepth(int depth) {
        for (int i = 0; i < depth; ++i) {
            System.out.print('-');
        }
    }

    protected abstract void add(AbstractFileComponent component);

    protected abstract void remove(AbstractFileComponent component);

    protected abstract void killVirus(int depth);
}
