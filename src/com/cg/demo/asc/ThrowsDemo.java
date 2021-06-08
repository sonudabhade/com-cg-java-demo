package com.cg.demo.asc;
//if you have a exception and you do not want handle it then throws keyword is used
public class ThrowsDemo {
    
	public static void m1() {
		System.out.println(10 /0);//1  -route cause of exception
	}
	
	public static void m2() {
		ThrowsDemo.m1();  //2
		
//		try {
//			ThrowsDemo.m1();  //2
//		} catch (ArithmeticException ae) {
//			System.out.println("Wrong");
//		}
		
	}
	
	public static void m3() {
		ThrowsDemo.m1();  //3
	}
	
	public static void main(String[] args) {
	System.out.println("start");
	ThrowsDemo.m3();  //4
	System.out.println("End");
    }
}
