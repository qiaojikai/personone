package designpattern.zuhe;

import java.util.LinkedList;
import java.util.List;

public class FolderFileComposite extends AbstractFileComponent {

    private List<AbstractFileComponent> components = new LinkedList<AbstractFileComponent>();

    public FolderFileComposite(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFileComponent component) {
        components.add(component);
    }

    @Override
    public void remove(AbstractFileComponent component) {
        components.remove(component);
    }

    @Override
    public void killVirus(int depth) {
    	System.out.println("depth==="+depth);
        printDepth(depth);
        System.out.println("目录 [" + name + "]杀毒");
//      System.out.println(components.size());
        for (AbstractFileComponent component : components) {
            component.killVirus(depth + 2);
        }
    }
}