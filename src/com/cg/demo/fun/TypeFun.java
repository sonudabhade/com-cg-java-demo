package com.cg.demo.fun;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TypeFun {
        public static void main(String[] args) {
        	//Function
			Function<Integer, Integer> fun = num1 -> num1 * num1;
		    
			System.out.println("Function Type of Function: "+fun.apply(10));
			
			//Predict
			Predicate<Integer> pred = num -> {
			
				if (num % 2 == 0)
					return true;
				return false;
			};
			System.out.println("Predict Type of Function: "+pred.test(22));
			
			//Consumer
			Consumer<String> con = name ->
			System.out.println("Consumer Type of Function: "+name);
			con.accept("Sonali");
			
			//Supplier
			Supplier<String> sup = ( ) -> "Sonali";
			System.out.println("Supplier type of Function: "+sup.get());
        }
}
