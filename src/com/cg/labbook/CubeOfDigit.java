package com.cg.labbook;

import java.util.Scanner;

public class CubeOfDigit {
	
	void Math(int n) {
	 double sum = Math.pow(n*(n+1)/2,2);
     System.out.println("The sum of first " + n + " cube numbers is " + sum);
     }
	public static void main(String[] args) {
		
		
		CubeOfDigit cube = new CubeOfDigit();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter n value:  ");
        n=sc.nextInt();
        cube.Math(n);
		
	}
}
