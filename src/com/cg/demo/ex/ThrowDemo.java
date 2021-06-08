package com.cg.demo.ex;
// within body
//it thorow one exception only
public class ThrowDemo {
	
	public static void checkEligibility(int age) {
		System.out.println("Some code");
		if(age < 18) {
			throw new ArithmeticException("can not vote");
		}else {
			System.out.println("vote for india");
		}
	}
	
	
       public static void main(String[] args) {
		  System.out.println("Election..started");
		  ThrowDemo.checkEligibility(19);
	}
}
