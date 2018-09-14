package javabase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import org.junit.Test;



public class Client {

 //   @Test
//    public void client() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, SecurityException, NoSuchFieldException {
//        ObjectPool pool = null;
//		try {
//			pool = ObjectPool.init("reflect/config.json");
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        User user = (User) pool.getObject("id1");
//        System.out.println(user);
//
//        Bean bean = (Bean) pool.getObject("id2");
//        System.out.println(bean);
//        
//        ComplexBean complexBean = (ComplexBean) pool.getObject("id3");
//        System.out.println(complexBean);
    	
//        User user = new User();
//        Field idFiled = User.class.getDeclaredField("id");
//        setAccessible(idFiled);
//        idFiled.setInt(user, 46);
//
//        Field nameFiled = User.class.getDeclaredField("name");
//        setAccessible(nameFiled);
//        nameFiled.set(user, "feiqing");
//
//        Field passwordField = User.class.getDeclaredField("password");
//        setAccessible(passwordField);
//        passwordField.set(user, "ICy5YqxZB1uWSwcVLSNLcA==");
//
//        System.out.println(user);
//    }
//    
//    private void setAccessible(AccessibleObject object) {
//        object.setAccessible(true);
//    }
	
		private Map<String, Object> objectMap;
	
	    public void test(Map<String, User> map, String string) {
	    }
	
	    public Map<User, Bean> test() {
	        return null;
	    }
	
//	    /**
//	     * 测试属性类型
//	     *
//	     * @throws NoSuchFieldException
//	     */
//	    @Test
//	    public void testFieldType() throws NoSuchFieldException {
//	        Field field = Client.class.getDeclaredField("objectMap");
//	        java.lang.reflect.Type gType = field.getGenericType();
//	        // 打印type与generic type的区别
//	        System.out.println(field.getType());
//	        System.out.println(gType);
//	        System.out.println("**************");
//	        if (gType instanceof ParameterizedType) {
//	            ParameterizedType pType = (ParameterizedType) gType;
//	            Type[] types = pType.getActualTypeArguments();
//	            for (Type type : types) {
//	                System.out.println(type.toString());
//	            }
//	        }
//	    }
	
	    /**
	     * 测试参数类型
	     *
	     * @throws NoSuchMethodException
	     */
	    @Test
	    public void testParamType() throws NoSuchMethodException {
	        Method testMethod = Client.class.getMethod("test", Map.class, String.class);
	        Type[] parameterTypes = testMethod.getGenericParameterTypes();
	        for (Type type : parameterTypes) {
	            System.out.println("type -> " + type);
	            if (type instanceof ParameterizedType) {
	                Type[] actualTypes = ((ParameterizedType) type).getActualTypeArguments();
	                for (Type actualType : actualTypes) {
	                    System.out.println("\tactual type -> " + actualType);
	                }
	            }
	        }
	    }
	
	    /**
	     * 测试返回值类型
	     *
	     * @throws NoSuchMethodException
	     */
	    @Test
	    public void testReturnType() throws NoSuchMethodException {
	        Method testMethod = Client.class.getMethod("test");
	        Type returnType = testMethod.getGenericReturnType();
	        System.out.println("return type -> " + returnType);
	
	        if (returnType instanceof ParameterizedType) {
	            Type[] actualTypes = ((ParameterizedType) returnType).getActualTypeArguments();
	            for (Type actualType : actualTypes) {
	                System.out.println("\tactual type -> " + actualType);
	            }
	        }
	    }
}
