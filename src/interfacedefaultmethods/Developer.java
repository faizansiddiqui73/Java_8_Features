package interfacedefaultmethods;

public interface Developer {
	
	default void init() {
		System.out.println("This is default method for all the developers.");
	}
	
	void develop();
	
}
