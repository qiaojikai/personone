package designpattern.agency;

public class StaticProxy implements Star {

    private Star star;

    public StaticProxy(Star star) {
        this.star = star;
    }

    @Override
    public void signContract() {
        System.out.println("代理签约");
    }

    /**
     * 代理可以帮明星做任何事, 但唯独唱歌这件事必须由Star自己来完成
     */
    @Override
    public void singSong() {
        star.singSong();
    }

    @Override
    public void collectMoney() {
        System.out.println("代理收钱");
    }
}