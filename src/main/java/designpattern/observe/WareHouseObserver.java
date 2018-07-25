package designpattern.observe;

class WareHouseObserver implements Observer {

    private String orderState;

    @Override
    public void update(Subject subject) {
        orderState = subject.getState();
        System.out.println("库存系统接收到消息 [" + orderState + "], 减少库存");
    }
}

class PayObserver implements Observer {

    private String orderState;

    @Override
    public void update(Subject subject) {
        orderState = subject.getState();
        System.out.println("支付系统接收到消息 [" + orderState + "], 正在收钱");
    }
}

class RelationObserver implements Observer {

    private String orderState;

    @Override
    public void update(Subject subject) {
        orderState = subject.getState();
        if (orderState.equals("已付款")) {
            System.out.println("关系系统接收到消息 [" + orderState + "], 当前用户已关注该店铺");
        } else if (orderState.equals("取消订单")) {
            System.out.println("关系系统接收到消息 [" + orderState + "], 当前用户取消关注该店铺");
        }
    }
}
