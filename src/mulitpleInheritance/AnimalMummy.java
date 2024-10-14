package mulitpleInheritance;

public interface AnimalMummy {
	void walk();
	void run();
	
	default void init() {
		System.out.println("this is the deafualt methods");
	}
}
