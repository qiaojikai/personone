package designpattern.waiguan;

public class MediumFacade {

    private CuiYuanApartment cuiyuan;

    private XiXiApartment xixi;

    private XiHuApartment xihu;

    public MediumFacade() {
        cuiyuan = new CuiYuanApartment("翠苑小区", 900, 1);
        xixi = new XiXiApartment("西溪花园", 1200, 1);
        xihu = new XiHuApartment("西湖小区", 2600, 1);
    }

    public void rentingHouse(double price) {
        // 价钱合适而且有房可组
        if (price >= cuiyuan.getPrice() && cuiyuan.getStatus() != 0) {
            System.out.println("预订" + cuiyuan.getLocation());
            cuiyuan.setStatus(0);
        } else if (price >= xixi.getPrice() && xixi.getStatus() != 0) {
            System.out.println("预订" + xixi.getLocation());
            xixi.setStatus(0);
        } else if (price >= xihu.getPrice() && xihu.getStatus() != 0) {
            System.out.println("预订" + xihu.getLocation());
            xihu.setStatus(0);
        } else {
            System.out.println("出价太低/没有房源 ...");
        }
    }
}
