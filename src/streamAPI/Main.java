package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		//imperative 
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum +=arr[i];
			}
		}
		System.out.println(sum);

		//declarative
		List<Integer> li = Arrays.asList(1,2,3,4,5);
		int sum2 = li.stream().filter(n->n%2==0).mapToInt(n->n).sum();
		System.out.println(sum2);

		List<Integer> list = Arrays.asList(1,2,3,4,343,54,45,47,88,86,22,32);
		
		List<Integer> filetredList = list.stream().filter(even ->even%2==0)
				.map(x->x/2)
				.distinct() //no repetition
				.sorted((a,b)->(b-a)) //descending
				.limit(4)
				.skip(1) //starting ka skip
				.collect(Collectors.toList());
		System.out.println(filetredList);
		
		List<Integer> filter = Stream.iterate(0,x->x+1)
				.limit(101)
				.skip(1)
				.filter(even->even%2==0)
				.map(divideBy2->divideBy2/2)
				.peek((x)->System.out.println(x))
				.collect(Collectors.toList());
		System.out.println(filter);
	}
}
