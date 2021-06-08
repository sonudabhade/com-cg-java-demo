package com.cg.labbook;

import java.util.Scanner;

public class Square {
	public static int difference(int n){
	      /*sum of squares of n natural number*/
	      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
	    
	      /*sum of n natural numbers*/
	      //6
	      int sumN = (n * (n + 1)) / 2;
	      
	      /*square of sum of n natural numbers*/
	      int squareSumN = sumN * sumN;
	      
	      //difference
	      //36-14 =22
	      return Math.abs(sumSquareN - squareSumN);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plz enter an integer -");
		int num= sc.nextInt();
		System.out.println("Number: " + num);
	    System.out.println("Difference: " + difference(num));
		//System.out.println("Sum of n natural numbers is:" +summation(num));		
       }
}
















//
//public class Square {
//	
//	
//	
//	
//	
//	 // Function to calculate sum
//	static int summation(int num)
//	{
//	    int sum = 0;
//	    for (int i = 1; i <= num; i++)
//	        sum += (i * i);
//	 
//	    return sum;
//	}
//	
//	public static int difference(int n){
//		
//	      /*sum of squares of n natural numbers
//	       * Squares of first three numbers
//              = 3x3 + 2x2 + 1x1
//              = 9 + 4 + 1
//              = 14
//	       * */
//		
//	      int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
//	      
//	      
//	      
//	      
//	      /*sum of n natural numbers*/
//	      //6
//	      int sumN = (n * (n + 1)) / 2;
//	      
//	      
//	      
//	      
//	      /*square of sum of n natural numbers
//	       * Squares of sum of first three numbers
//            *= (3 + 2 + 1)x(3 + 2 + 1)
//            *= 6x6
//            *= 36*/
//	      
//	      int squareSumN = sumN * sumN;
//	      
//	      
//	      
//	      //difference
//	      //36-14 =22
//	      return Math.abs(sumSquareN - squareSumN);
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Plz enter an integer -");
//		int num= sc.nextInt();
//		
//		System.out.println("Number: " + num);
//	    System.out.println("Difference: " + difference(num));
//		//System.out.println("Sum of n natural numbers is:" +summation(num));
//		
//		
//}
//}