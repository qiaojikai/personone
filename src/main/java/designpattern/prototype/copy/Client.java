package designpattern.prototype.copy;

import java.util.Date;

import org.junit.Test;

public class Client {

    @Test
    public void client() throws CloneNotSupportedException {
        Date birthday = new Date();
        Sheep mother = new Sheep("多利母亲", birthday);
        System.out.println(mother);

        Sheep dolly = mother.clone();
        dolly.setName("多利");
        System.out.println(dolly);
    }
}
