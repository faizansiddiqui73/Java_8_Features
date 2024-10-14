package predicateANDstreamANDfunctionalinterface;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		Function<Integer, Integer> function1= s -> s*2 ;
		Function<Integer, Integer> function2 = x -> x*x;
		
		System.out.println(function1.andThen(function2).apply(2)); //16
		System.out.println(function1.compose(function2).apply(2)); //8
		
		Function<String, String> identityFunction = Function.identity();
		System.out.println(identityFunction.apply("Return"));
		
	}
}
