package javabase.annotation.test1;

import java.lang.annotation.Annotation;

import org.junit.Test;
@Tag(name = "client")
public class Client {
//
//    @Test
//    public void client(){
//        new SubClass();
//    }
//	 @Test
//	    public void client() throws NoSuchMethodException {
//	        Annotation[] annotations = this.getClass().getMethod("client").getAnnotations();
//	        for (Annotation annotation : annotations) {
//	            System.out.println(annotation.annotationType().getName());
//	        }
//	    }
	 
	   @Test
	    public void client() throws NoSuchMethodException {
	        Annotation[] annotations = this.getClass().getAnnotations();
	        for (Annotation annotation : annotations) {
	            if (annotation instanceof Tag) {
	                Tag tag = (Tag) annotation;
	                System.out.println("name: " + tag.name());
	                System.out.println("description: " + tag.description());
	            }
	        }
	    }
}

	@Testable
	class SupperClass{
	}

	class SubClass extends SupperClass{
	    public SubClass() {
	        for (Annotation annotation : SubClass.class.getAnnotations()){
	            System.out.println(annotation);
	        }
	    }
	}
