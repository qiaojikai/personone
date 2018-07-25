package javabase.stringdemo;

import org.junit.Test;

public class Test2 {
	  public String change(String s, int i, StringBuffer sb){
	        s="123";
	        i=3;
	        sb.append("woshi");
	    //    p.setAge(100);
	        sb = new StringBuffer("sbsb");
	      //  p = new Person("bb",44);
	        return s;
	    }
	 
	    @Test
	    public void testChange(){
	        StringBuffer sb = new StringBuffer("buff");
	        String s = "aaa";
	        int i = 1;
	    //    Person p = new Person("aa",12);
	        i=2;
	        change(s,i,sb);
//	        s="222";
	        System.out.println(s);
	        System.out.println(i);
	        System.out.println(sb.toString());
	       // System.out.println(p);
	    }
}

//class Person{
//	
//	public Integer age;
//	
//	public Person() {
//		
//	}
//	
//	public Person(String type,int value) {
//		
//	}
//
//	public Integer getAge() {
//		return age;
//	}
//
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//	
//	
//	
//}