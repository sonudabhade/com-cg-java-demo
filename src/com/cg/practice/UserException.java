package com.cg.practice;


import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String s)
	{  
		super(s);
	}
	
}
public class UserException {
	void checkAge(int age) throws InvalidAgeException{
		if (age < 15) {
			throw new InvalidAgeException("Age of a person should be above 15");
		} else {
			System.out.println("Valid Age");
		}
	}
	
	public static void main(String[] args) {
		UserException obj = new UserException();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Age");
			int num = sc.nextInt();
			obj.checkAge(num);
		} catch (InvalidAgeException ae) {
			//System.out.println("valid Age");
			System.out.println(ae.getMessage());
		}
		
	}
}
