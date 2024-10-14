package thread;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NotThreadSafeExample {

	public static void main(String[] args) {
		List<String> li = new CopyOnWriteArrayList<String>();
		li.add("first");
		li.add("second");
		li.add("third");
		li.add("fourth");
		li.add("fifth");

		//		Runnable t1 = new Runnable() {
		//			
		//			@Override
		//			public void run() {
		//				// TODO Auto-generated method stub
		//				
		//			}
		//		};

		//Replace with lambda expression
		//Coz Runnable is functional interface and it's contain SAM so no need for implementation
		Runnable t1 = ()-> {
			//thread 1
			for(String s:li) {
				System.out.println(s + " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};

		Runnable t2 = ()->{
			li.add("sixth");
			li.add("seventh");
			li.add("eight");
			li.add("nineth");
			li.add("tenth");

		};

		//start the thread
		
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		Thread thread2 = new Thread(t2);
		thread2.start();
		
//		Thread thread3 = new Thread(t3);



	}
}	
