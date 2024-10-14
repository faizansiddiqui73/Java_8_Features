package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectHandler implements InvocationHandler{

	private Object object;

	public ObjectHandler(Object object) {
		super();
		this.object = object;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//logic for client adding java
		if(method.getName().contains("put")) {
			if(args[0].equals("Java")) {
				System.out.println("Invalid Key : Java");
				return null;
			}
		}
		
		//logic before method call
		System.out.println("Before method call");
		
		Object invoke = method.invoke(object, args);
		
		System.out.println("After method call");
		
		//logic after method call
		
		return invoke;
	}

}
