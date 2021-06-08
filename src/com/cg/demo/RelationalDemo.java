package com.cg.demo;

public class RelationalDemo {
	
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		
		// (salaryOffered < salaryExpected)  
		
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true
		System.out.println(num1 > num2); // false
		System.out.println(num1 >= num2); // false
		System.out.println(num1 < num2); // true
		System.out.println(num1 <= num2); // true

		
		
		
		if (num1 > num2) {
			System.out.println("Equals");
		} else {
			System.out.println("not Equal.");
		}
		
		
	}

}