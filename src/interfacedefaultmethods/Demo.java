package interfacedefaultmethods;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AndroidDeveloper ad = new AndroidDeveloper();
		ad.develop();
		IosDeveloper is = new IosDeveloper();
		is.develop();
		
		ad.init();
		is.init();

	}

}
