package my.patterns.others.functional;

import java.util.function.BiFunction;

public class Main {
	public static void main(String args[])throws Exception{
		BiFunction<Double , Integer,Double> func=(i,n) -> Math.pow(i, n);
		System.out.println(func.apply(2D, 3));
		
		System.out.println(MyMultiply.multiplyIt(10).apply(5));
		System.out.println(MyMultiply.multiplyIt(4).apply(5));
		
		TriFunction<Integer,Integer ,Integer , Integer > test=(a,b,c) -> (a*b*c);
		System.out.println(test.apply(2, 3, 4));
		
	}
	

}
