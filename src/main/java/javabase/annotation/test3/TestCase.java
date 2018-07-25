package javabase.annotation.test3;

import java.io.IOException;

public class TestCase {

    @Testable3
    public void test1() {
        System.out.println("test1");
    }

    public void test2() throws IOException {
        System.out.println("test2");
        throw new IOException("我test2出错啦...");
    }

    @Testable3
    public void test3() {
        System.out.println("test3");
        throw new RuntimeException("我test3出错啦...");
    }

    public void test4() {
        System.out.println("test4");
    }

    @Testable3
    public void test5() {
        System.out.println("test5");
    }

    @Testable3
    public void test6() {
        System.out.println("test6");
    }
}