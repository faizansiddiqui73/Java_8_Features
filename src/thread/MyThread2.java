package thread;

public class MyThread2 extends Thread {
	
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.print(i + " ");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
