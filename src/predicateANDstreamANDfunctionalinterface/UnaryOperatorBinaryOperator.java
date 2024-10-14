package predicateANDstreamANDfunctionalinterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorBinaryOperator {
	public static void main(String[] args) {
		Function<Integer, Integer> fun = x->x*x;
		UnaryOperator<Integer> un = x-> x*x;
		
		System.out.println(fun.apply(4));
		System.out.println(un.apply(4));
		
		BiFunction<String, String, String> bifun = (str1,str2)-> str1+str2;
		System.out.println(bifun.apply("fai","zan"));
		
		BinaryOperator<String> binaryFun = (str1,str2)-> str1+str2;
		System.out.println(binaryFun.apply("ans", "hul"));
	}
}
