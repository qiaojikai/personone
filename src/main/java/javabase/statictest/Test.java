package javabase.statictest;

public class Test {
  
   static {  
        _i = 20;  
    }  
   public static int _i = 10; 
      
    public static void main(String[] args) {  
        System.out.println(_i);  
    }  
}
