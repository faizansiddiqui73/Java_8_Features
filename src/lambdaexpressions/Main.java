package lambdaexpressions;


public class Main {
	public static void main(String[] args) {
		Employee se = ()-> "Software Engineer";
		System.out.println(se.getName());

		Employee sde = ()-> {
			return "Software Development Engineer";
		};
		System.out.println(sde.getName());

		Runnable runnable = ()->{
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(500);
					System.out.println("Hello "+ i);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}

		};

		//				MyClass m = new MyClass();
		Thread t1 = new Thread(runnable);
		t1.run();

	}
}

