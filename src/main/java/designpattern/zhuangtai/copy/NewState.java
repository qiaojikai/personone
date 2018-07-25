package designpattern.zhuangtai.copy;

class NewState implements State {

    static final NewState instance = new NewState();

    // 单例 or 享元
    public static State instance() {
        return instance;
    }

    @Override
    public void handle(Context context) {
        if (context.getCurrent() == this) {
            // 本状态下的核心业务处理
            System.out.println("测试: 发现了Bug, 开发同学赶紧处理");
            // 状态流转
            context.setCurrent(OpenState.instance());
        }
    }
}

class OpenState implements State {

    static final OpenState instance = new OpenState();

    public static State instance() {
        return instance;
    }

    @Override
    public void handle(Context context) {
        if (context.getCurrent() == this) {
            System.out.println("开发: Bug已经看到, 正在处理");
            context.setCurrent(FixedState.instance());
        }
    }
}

class FixedState implements State {

    static final FixedState instance = new FixedState();

    public static State instance() {
        return instance;
    }

    @Override
    public void handle(Context context) {
        if (context.getCurrent() == this) {
            System.out.println("开发: Bug已经修复, 测试同学看一下");
            context.setCurrent(ClosedState.instance());
        }
    }
}

class ClosedState implements State {

    static final ClosedState instance = new ClosedState();

    public static State instance() {
        return instance;
    }

    @Override
    public void handle(Context context) {
        if (context.getCurrent() == this) {
            System.out.println("测试: Bug验证通过, 已关闭");
            context.setCurrent(null);
        }
    }
}
