package javabase.container.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args){
		HashMap<String, Object>  hashMap = new HashMap<String, Object>();
		hashMap.put("ONE", "1");
		hashMap.put("TWO", "2");
//		System.out.println(hashMap.put("TWO", "22"));
		hashMap.put("THREE", "3");
		hashMap.put("THREE", "33");
		Iterator iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry entry = (Map.Entry)iterator.next();
//			System.out.println(entry.getValue());
		}
	}
}


