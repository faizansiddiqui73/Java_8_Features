package dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) {

		Map fees = (Map) Proxy.newProxyInstance(
				HashMap.class.getClassLoader(),
				new Class[] {Map.class}, 
				new ObjectHandler(new HashMap<String, Integer>())
				);
		
		fees.put("Java", 4000);
		fees.put("Python", 5000);
		System.out.println(fees);
	}

}
