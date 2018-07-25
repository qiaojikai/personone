package designpattern.mediator;

class USA extends Country {

    public USA(UnitedNations mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void declare(String msg) {
        mediator.declare(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("美国接收到: [" + msg + "]");
    }
}

class Iraq extends Country {

    public Iraq(UnitedNations mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void declare(String msg) {
        mediator.declare(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("伊拉克接收到: [" + msg + "]");
    }
}

class China extends Country {

    public China(UnitedNations mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void declare(String msg) {
        mediator.declare(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("中国接收到: [" + msg + "]");
    }
}
