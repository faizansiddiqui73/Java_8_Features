package mulitpleInheritance;

public class Child	implements Animal,AnimalMummy{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Animal is walking");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Animal is talking");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Animal is running");
	}
	

}
