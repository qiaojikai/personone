package javabase.annotation.test3;

import java.lang.reflect.Method;

public class TestableProcessor {

    public static void process(String clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        int passed = 0;
        int failed = 0;
        Object obj = Class.forName(clazz).newInstance();
        for (Method method : Class.forName(clazz).getMethods()) {
            if (method.isAnnotationPresent(Testable3.class)) {
                try {
                    method.invoke(obj);
                    ++passed;
                } catch (Exception e) {
                    System.out.println("method " + method.getName() + " execute error: < " + e.getCause() + " >");
                    e.printStackTrace(System.out);
                    ++failed;
                }
            }
        }

        System.out.println("共运行" + (failed + passed) + "个方法, 成功" + passed + "个, 失败" + failed + "个");
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        TestableProcessor.process("javabase.annotation.test3.TestCase");
    }
}