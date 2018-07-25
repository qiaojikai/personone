package designpattern.xiangyuan.copy;

class GoFlyweight implements Flyweight {

    private String color;

    private double radius;

    private String material;

    public GoFlyweight(String color, double radius, String material) {
        this.color = color;
        this.radius = radius;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void operation(Location location) {
        System.out.println("[" + color + "]棋 [" + material + "]材质 半径[" + radius + "]CM 落在" + location);
    }
}
