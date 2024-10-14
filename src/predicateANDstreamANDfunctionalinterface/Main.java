package predicateANDstreamANDfunctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Predicate<Integer> isEven = (x-> x%2==0);
		for(int num:numbers) {
			if(isEven.test(num)) {
				System.out.println(num);
			}
		}
		
		Predicate<String> startsWithV = s -> s.toLowerCase().charAt(0) =='v';//single line you can remove the curly and normal braces
		Boolean ans = startsWithV.test("x"); //auto-boxing conversion from primitive to wrapper class
		System.out.println(ans);
	}
	

}
