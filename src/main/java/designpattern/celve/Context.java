package designpattern.celve;

public class Context {

    private Strategy strategy;

    public void setStrategy(Type type, double... args) {
        if (type == Type.NORMAL) {
            strategy = new Normal();
        } else if (type == Type.DISCOUNT) {
            strategy = new Discount(args[0]);
        } else if (type == Type.REBATE) {
            strategy = new Rebate(args[0], args[1]);
        }
    }

    public double getResult(double money) {
        return strategy.acceptCash(money);
    }

    public enum Type {
        NORMAL(0, "正常"),
        DISCOUNT(1, "打折"),
        REBATE(2, "返利");

        private int value;

        private String desc;

        Type(int value, String desc) {
            this.value = value;
            this.desc = desc;
        }
    }
}
