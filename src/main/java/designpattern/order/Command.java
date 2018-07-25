package designpattern.order;

//抽象命令接口: 类中对需要执行的操作进行声明, 且包含一个Receiver, 
//并公布一个execute()方法用来调用Receiver执行命令:
public abstract class Command {

    protected CookReceiver receiver;

    public Command(CookReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}