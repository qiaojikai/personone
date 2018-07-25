package javabase.stringdemo;

public class Test1 {
	public  static String change(String s){
	     s = "222";
	     return s; 
	}
	public static void main(String[] args){
	    String s = "111"; 
	    change(s);
	    System.out.println("s=="+s);
	}
}
