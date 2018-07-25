package designpattern.bridge.copy;

public interface Brand {
    String brand();
}

class Lenovo implements Brand {

    @Override
    public String brand() {
        return "联想";
    }
}

class Dell implements Brand {

    @Override
    public String brand() {
        return "戴尔";
    }
}

class Hasee implements Brand {

    @Override
    public String brand() {
        return "神州";
    }
}