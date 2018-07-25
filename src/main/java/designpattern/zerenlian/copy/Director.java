package designpattern.zerenlian.copy;


//总监
class Director extends Leader {

    public Director(Leader superior, String name) {
        super(superior, name);
        System.out.println("总监构造");
    }

    @Override
    public void handle(Request request) {
    	System.out.println("总监");
        if (request.getType().equals("请假") && request.getCount() <= 10) {
            System.out.println("[ " + request.getContent() + "] 请假 [" + request.getCount() + "]天, 总监 [" + name + "] 审批通过");
        } else {
            if (superior != null) {
            	System.out.println("姓名：==="+superior.name);
                superior.handle(request);
            }
        }
    }
}

//经理
class Manager extends Leader {
    public Manager(Leader superior, String name) {
        super(superior, name);
        System.out.println("经理构造");
    }

    @Override
    public void handle(Request request) {
    	System.out.println("经理");
        if (request.getType().equals("请假") && request.getCount() <= 20) {
            System.out.println("[ " + request.getContent() + "] 请假 [" + request.getCount() + "]天, 经理 [" + name + "] 审批通过");
        } else if (request.getType().equals("涨薪") && request.getCount() <= 1000) {
            System.out.println("[ " + request.getContent() + "]  涨薪 [" + request.getCount() + "]RMB, 经理 [" + name + "] 审批通过");
        } else {
            if (superior != null) {
                superior.handle(request);
            }
        }
    }
}


//总经理
class GeneralManager extends Leader {

    public GeneralManager(Leader superior, String name) {
        super(superior, name);
        System.out.println("总经理构造");
    }

    @Override
    public void handle(Request request) {
    	System.out.println("总经理");
        if (request.getType().equals("请假")) {
            if (request.getCount() <= 30) {
                System.out.println("[ " + request.getContent() + "] 请假 [" + request.getCount() + "]天, 总经理 [" + name + "] 审批通过");
            } else {
                System.out.println("[ " + request.getContent() + "] 你干脆辞职算了");
            }
        } else if (request.getType().equals("涨薪")) {
            if (request.getCount() <= 10000) {
                System.out.println("[ " + request.getContent() + "]  涨薪 [" + request.getCount() + "]RMB, 总经理 [" + name + "] 审批通过");
            } else {
                System.out.println("你咋不上天呢");
            }
        }
    }
}
