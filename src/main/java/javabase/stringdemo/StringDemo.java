package javabase.stringdemo;

public class StringDemo {
    public static void main(String[] args) {
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        System.out.println(s1 == s2);// false
//        System.out.println(s1.equals(s2));// true
//
//        String s3 = new String("hello");
//        String s4 = "hello";
//        System.out.println(s3 == s4);// false
//        System.out.println(s3.equals(s4));// true
//
//        String s5 = "hello";
//        String s6 = "hello";
//        System.out.println(s5 == s6);// true
//        System.out.println(s5.equals(s6));// true
    	
    	//字符串如果是变量相加，先开空间，在拼接。
    	//字符串如果是常量相加，是先加，然后在常量池找，如果有就直接返回，否则，就创建。 
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1 + s2);// false
        System.out.println(s3.equals((s1 + s2)));// true
        System.out.println(s3 == "hello" + "world");//true
        System.out.println(s3.equals("hello" + "world"));// true
    }
}
