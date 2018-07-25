package designpattern.xiangyuan;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, GoFlyweight> map = new HashMap<String, GoFlyweight>();

    public static GoFlyweight getGoFlyweight(String color) {
        GoFlyweight flyweight = map.get(color);
        if (flyweight == null) {
            flyweight = new GoFlyweight(color, 1.1, "陶瓷");
            map.put(color, flyweight);
        }
        return flyweight;
    }
}
