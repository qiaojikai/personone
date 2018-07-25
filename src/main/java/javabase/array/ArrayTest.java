package javabase.array;

public class ArrayTest {

	public static void main(String[] args){
		Object obj = new Object();
		Integer[] s = new Integer[5];
		System.out.println(s.getClass().getComponentType().isPrimitive());  //数组中的元素是引用类型，还是基本类型
//		s[1] = "22";
//		System.out.println(s[1]);
	}
}
