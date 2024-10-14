package interfacedefaultmethods;

public class IosDeveloper implements Developer{
	
	//we can change the default method by overriding for the child class
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("This is the init method of cahild class IosDeveloper");
	}

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		System.out.println("I am Ios Deeveloper");
	}

}
