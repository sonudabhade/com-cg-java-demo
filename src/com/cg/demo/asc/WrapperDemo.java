package com.cg.demo.asc;

public class WrapperDemo {

	public static void main(String[] args) {
		String name = "Sonu";  //name is also object of String
		name.charAt(0);
		System.out.println(name.charAt(0));
		System.out.println("\n" +name);
		
		int num = 10;  //num is premitive data 
//		num.  //error 
		
		Integer num2 = 10; //num2 is object of integer
		System.out.println(num2.toString());
		
		WrapperDemo obj = new WrapperDemo();
		WrapperDemo obj2 = new WrapperDemo();

		
		System.out.println("\n" +obj.toString());
		System.out.println("\n" +obj.hashCode());
		

		System.out.println("\n" +obj2.hashCode());

		System.out.println("\n" + obj.equals(obj2));

		
	}
	
	
}
