package designpattern.mobanfangfa;

public abstract class AbstractATMBusiness {

    public void run() {
        System.out.println("-> 插卡");
        System.out.println("-> 输入并校验密码");
        if (checkPassword()) {
            onBusiness();
        }

        System.out.println("-> 取卡");
    }

    // 具体业务处理延迟到子类实现
    protected abstract void onBusiness();

    private boolean checkPassword() {
        // TODO Encode Password, Select DB & Comparison
        return true;
    }
}
