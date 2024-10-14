package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Prac {

	public static void main(String[] args) {
		List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		Integer ans = nums.stream().distinct().sorted().skip(1).findFirst().orElse(0); //ascending
		System.out.println(ans);
		Integer secondLargerst = nums.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElse(null); //desceding
		System.out.println(secondLargerst);
		
	}
}
	