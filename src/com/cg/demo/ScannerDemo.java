package com.cg.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an integer - ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + num2);

		System.out.println("Please enter an floating point number- ");
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		System.out.println(num3 + num4);

		System.out.println("Please enter an String value - ");
		String name = sc.next();
		System.out.println("Name is"+name);
	}

}