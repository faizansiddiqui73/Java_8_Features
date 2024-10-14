package predicateANDstreamANDfunctionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {
		Predicate<Integer> pre = x-> x%2==0; //test
		Function<Integer, Integer> function = x->x*x; //apply,andthen,Compose,identity
		Consumer<Integer> con = x -> System.out.println(x); //accept,andThen
		Supplier<Integer> sup = ()-> 100; //get
		
		if(pre.test(sup.get())) {
			con.accept(function.apply(sup.get()));
		}
	}

}
