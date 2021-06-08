package com.cg.oop;

public class BlockDemo {
   
	static int num1=10;
	
	static void m1() {
		System.out.println("m1");
	}
	
	//static block
	static {
		System.out.println("static method");
	}
	static {
		System.out.println("another static block");
	}
	
	
	//non static block
	{
		System.out.println("non static method");
	}
	{
		System.out.println("another non static block");
	}

	
	public static void main(String[] args) {
		System.out.println("main method");
		//BlockDemo b1= new BlockDemo();
		BlockDemo.m1();  //called static method using class reference
		m1();
		System.out.println(num1);
    }
}
