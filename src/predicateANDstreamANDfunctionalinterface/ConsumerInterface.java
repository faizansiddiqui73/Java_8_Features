package predicateANDstreamANDfunctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<List<Integer>> listCosumer1 = li ->{
			for(Integer i:li) {
				System.out.println(i + 200);
			}

		};
		
		Consumer<List<Integer>> listConsumer2 = li ->{
			for(Integer j:li) {
				System.out.println(j);
			}
		};
		
		listCosumer1.andThen(listConsumer2).accept(Arrays.asList(1,2,3));
		System.out.println("---------------");
		listConsumer2.andThen(listCosumer1).accept(Arrays.asList(4,5,6));
		
		
	}

}
