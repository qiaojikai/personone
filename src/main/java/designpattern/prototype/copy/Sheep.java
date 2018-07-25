package designpattern.prototype.copy;

import java.util.Date;

public class Sheep implements Cloneable {

    private String name;
    private Date birthday;

    public Sheep() {
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
    	Sheep sheep = (Sheep) super.clone();
        // 添加下面代码支持深复制
        sheep.birthday = (Date) this.birthday.clone();
        return sheep;
    }
}
