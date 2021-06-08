package com.cg.demo;


//    &&   ||   !

public class LogicalDemo {

	public static void main(String[] args) {

		int salary = 12;
		int leaves = 15;
		int expectedSalary = 10;
		int expectedleaves = 20;

//		System.out.println(salary >= expectedSalary);
//		System.out.println(leaves >= expectedleaves);

		System.out.println((salary >= expectedSalary) && (leaves >= expectedleaves)); // false 
		//In AND Any one value is false in a condition then its gives output false

		System.out.println((salary >= expectedSalary) || (leaves >= expectedleaves)); // true 
		//In OR Any one value is True in a condition then its gives output true
		
		if ((salary >= expectedSalary) && (leaves >= expectedleaves))
		{
			System.out.println("join Company");
		}
		else
		{
			System.out.println("Do not join");
		}
	}

}