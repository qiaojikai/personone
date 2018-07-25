package designpattern.celve;

//正常收费
class Normal implements Strategy {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}

// 打折收费
class Discount implements Strategy {

    private double rate;

    public Discount(double rate) {
        if (rate > 1.0) {
            throw new RuntimeException("折扣力度怎么能大于1.0?");
        }
        this.rate = rate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rate;
    }
}

// 返利收费
class Rebate implements Strategy {

    private double cashState;

    private double cashReturn;

    public Rebate(double cashState, double cashReturn) {
        this.cashState = cashState;
        this.cashReturn = cashReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money > cashState) {
            money -= Math.floor(money / cashState) * cashReturn;
        }
        return money;
    }
}
