package designpattern.beiwanglu.copy;

import java.util.Deque;
import java.util.LinkedList;

public class RoleStateCaretaker {

    private Deque<RoleStateMemento> stack = new LinkedList<RoleStateMemento>();

    public void save(RoleStateMemento memento) {
        stack.push(memento);
    }

    public RoleStateMemento checkout() {
        return stack.pop();
    }
}
