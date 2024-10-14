package predicateANDstreamANDfunctionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class bipredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pre = (x->x%2==0);
		
		BiPredicate<Integer, Integer> bipredicate = (x,y) -> x%2==0 && y%4==0;
		System.out.println(bipredicate.test(20, 10));
		
		Function<String, Integer> fun = x->x.length();
		System.out.println(fun.apply("ans"));
		
		BiFunction<String, String, Integer> function = (x,y)-> x.length() + y.length();
		System.out.println(function.apply("Faizan", "Siddiqui"));
		
		Consumer<Integer> con = (x)->{
			System.out.println(x);
		};
		con.accept(34);
		
		BiConsumer<Integer,Integer> con1 = (a,b)->{
			System.out.println(a + b);
		};
		con1.accept(32, 21);
		
		Supplier<Integer> sup = ()-> 100;
		
		System.out.println(sup.get());
		
	}

}
