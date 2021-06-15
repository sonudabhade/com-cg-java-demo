package com.cg.demo.fun;

public class FunDemo {
 
	
	public static void main(String[] args) {
		FunInterface fun = (int i) -> {
			System.out.println("functional demo");
		};
		
		fun.functionalMethod(10);
	}
}
//public class FunDemo implements FunIn {
//
//	public static void main(String[] args) {
//		FunDemo obj = new FunDemo();
//		obj.functionalMethod(10);
//
//	}
//
//	@Override
//	public boolean functionalMethod(int i) {
//		System.out.println("functionalMethod");
//		if (i % 2 == 0)
//			return true;
//		return false;
//	}
//}
