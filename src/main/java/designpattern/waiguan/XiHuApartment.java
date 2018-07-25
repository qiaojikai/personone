package designpattern.waiguan;

public class XiHuApartment {

    private String location;

    private double price;

    private int status;

    public XiHuApartment(String location, double price, int status) {
        this.location = location;
        this.price = price;
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

class XiXiApartment {
    private String location;

    private double price;

    private int status;

    public XiXiApartment(String location, double price, int status) {
        this.location = location;
        this.price = price;
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

class CuiYuanApartment {

    private String location;

    private double price;

    private int status;

    public CuiYuanApartment(String location, double price, int status) {
        this.location = location;
        this.price = price;
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}