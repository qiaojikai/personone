package designpattern.order;

//具体命令类: 实现Command内的抽象方法(调用Receiver提供的方法).
/**
* 烤肉命令
*/
class BackMuttonCommand extends Command {

   public BackMuttonCommand(CookReceiver receiver) {
       super(receiver);
   }

   @Override
   public void execute() {
       this.receiver.bakeMutton();
   }
}

/**
* 烤鸡翅命令
*/
class BackChickenWingCommand extends Command {

   public BackChickenWingCommand(CookReceiver receiver) {
       super(receiver);
   }

   @Override
   public void execute() {
       this.receiver.backChickenWing();
   }
}