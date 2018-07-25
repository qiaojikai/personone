package designpattern.order;

import java.util.LinkedList;
import java.util.Queue;



public class WaiterInvoker {

    private Queue<Command> queue = new LinkedList<Command>();

    public void addCommand(Command command) {
        if (checkCommand(command)) {
            queue.add(command);
        }
    }

    public void cancelCommand(Command command) {

        // 如果命令已经执行过, 则不予撤销
        if (!queue.isEmpty()) {
            queue.remove(command);
        }
    }

    /**
     * 通知执行所有命令
     */
    public void notifyExecute() {
        while (!queue.isEmpty()) {
            Command command = queue.poll();
            command.execute();
        }
    }

    private boolean checkCommand(Command command) {

        // TODO 检查命令是否有效: 如当前原材料是否充足等
        return true;
    }
}