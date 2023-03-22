package Lambda.in;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	
	public static void main(String[] args) {
		
		BiFunction<Integer , Integer ,Integer> bifunction = (a ,b) -> a+b;
		System.out.println(bifunction.apply(10, 20));
	}

}
