package com.cg.demo.asc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static int divide() {
		Scanner sc= new Scanner(System.in);
		
	
		try {
			System.out.println("Enter 1");
			int num1 = sc.nextInt();
			System.out.println("Enter 2");
			int num2 = sc.nextInt();
			return num1 =num2;

		} catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae);
			System.out.println("do not divide by 0"); // business decision
			return 0;

		} catch (InputMismatchException ime) {
			System.out.println("please enter only integer value");
	        return 0;    	
		
		}finally {
			sc.close();
		}
		//sc.close();
		
		
		
		/*try {
			return num1 / num2;
		} catch(ArithmeticException obj) {
			return 0;
			
		}*/

	}
	
	
	
  public static void main(String[] args) {
		System.out.println("Start");
		ExceptionDemo.divide();
		System.out.println("End");

  }
 }

