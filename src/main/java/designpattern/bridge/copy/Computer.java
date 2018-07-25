package designpattern.bridge.copy;

public abstract class Computer {

    private Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public abstract String type();

    public void sale() {
        System.out.println("我们卖的是<" + brand.brand() + this.type() + ">电脑");
    }
}

class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public String type() {
        return "台式";
    }
}

class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public String type() {
        return "笔记本";
    }
}

class Pad extends Computer {
    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public String type() {
        return "平板";
    }
}
class Smartphone extends Computer {

    public Smartphone(Brand brand) {
        super(brand);
    }

    @Override
    public String type() {
        return "智能手机";
    }
}