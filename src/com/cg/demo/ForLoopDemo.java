package com.cg.demo;

public class ForLoopDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("End");
		
		
		
		
		//Pattern
		for (int i = 1; i <= 5; i++) { // outer loop
			for (int j = 1; j <= i; j++) { // inner loop
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}