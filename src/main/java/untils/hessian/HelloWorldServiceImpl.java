package untils.hessian;

public class HelloWorldServiceImpl implements HelloWorldService {
	public String sayHello(String str){
		 String result = "hello world " + str;
         System.out.println(result);
         return result;
	}
}
