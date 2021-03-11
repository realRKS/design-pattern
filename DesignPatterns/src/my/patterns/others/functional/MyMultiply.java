package my.patterns.others.functional;

import java.util.function.Function;

public class MyMultiply {
	
	public static Function<Integer, Integer> multiplyIt(Integer num){
		if(num<5) {
			return n -> n*2;
		}
		else
			return n -> n*num;
	}

}
