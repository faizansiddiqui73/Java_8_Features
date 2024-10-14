package optionals;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		Optional<String> name = getName(2);
//		if(name.isPresent()) {
//			System.out.println(name.get());
//		}
		String nameToBeUsed = name.isPresent()? name.get():"Default Name";
		System.out.println(nameToBeUsed);
	}

	private static Optional<String> getName(int n) {
//		String name = null;
		String name = "Faizan";
		return Optional.ofNullable(name);
//		return Optional.of("Faizan");
	}
}
