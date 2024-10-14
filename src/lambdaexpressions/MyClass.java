package lambdaexpressions;

public class MyClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Hello "+ i);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
