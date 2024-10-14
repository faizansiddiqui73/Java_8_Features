package streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		//storing the answer
		Double ans  = ls.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
		System.out.println(ans);

		List<Integer> nums = Arrays.asList(1,2,3,2,4,45,67,7,3,37,33,55,44,33);
		List<Integer> ansOfDuplicate = nums.stream().distinct().collect(Collectors.toList());
		System.out.println(ansOfDuplicate);

		int evensum = nums.stream().filter(even->even%2==0).mapToInt(value ->value).sum();
		int oddsum = nums.stream().filter(even->even%2!=0).mapToInt(odd->odd).sum();
		System.out.println(evensum);
		System.out.println(oddsum);

		List<String> li = Arrays.asList("BanaNA","FAiZaN");
		List<String> ansU = li.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(ansU);          //className::methodName //method reference

		List<String> lower = li.stream().map(str->str.toLowerCase()).collect(Collectors.toList());
		System.out.println(lower); 

		List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		char specificLetter = 'B';
		long count = colors.stream().filter(str->str.startsWith(String.valueOf(specificLetter))).count();
		long c = colors.stream().filter(str->str.charAt(0)==specificLetter).count();
		System.out.println(count);
		System.out.println(c);

		List<String> list = colors.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		List<String> reverseList = colors.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println(reverseList);

		List < Integer > nums1 = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		Integer max_val = nums1.stream().max((a,b)->a.compareTo(b)).orElse(0);
		System.out.println(max_val);

		Integer min_val = nums1.stream().min(Integer::compare).orElse(0);
		System.out.println(min_val);
		
		Integer secondSmallest = nums1.stream().distinct().sorted().skip(1).findFirst().orElse(null); //ASC
		System.out.println(secondSmallest);
		
		Integer secondLargestElement = nums1.stream().distinct().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElse(null); //DESC
		System.out.println(secondLargestElement);
	}
}

