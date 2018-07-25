package javabase.loadingorder;



public class Child extends Parent {
    int x = 10;
    static int y = 11;
    // 静态代码块
    static {
        System.out.println("Child静态代码块：y=" + y);
        y++;
    }

    // 构造函数
    Child() {
        System.out.println("Child构造函数： x=" + x);
        System.out.println("Child构造函数： y=" + y);
    }
    
    // 代码块
    {
    	System.out.println("Child代码块： x=" + x);
    	System.out.println("Child代码块： y=" + y);
    	y++;
    	x++;
    }

    // 方法
    void function() {
        System.out.println("Child function run ……");
    }
    
    public static void main(String[] args){
    	System.out.println("hellWorld");
    	System.out.println(Parent.class.isPrimitive()
    			);
    }

}
