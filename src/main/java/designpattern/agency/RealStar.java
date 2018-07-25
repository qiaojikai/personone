package designpattern.agency;

public class RealStar implements Star {
    /**
     * 由于这些事情都委托给代理来做了, 因此我们只是象征性实现就好了
     */
    @Override
    public void signContract() {
    }

    @Override
    public void collectMoney() {
    }

    /**
     * 但唱歌是要自己真唱的
     */
    @Override
    public void singSong() {
        System.out.println("周杰伦在唱歌");
    }
}