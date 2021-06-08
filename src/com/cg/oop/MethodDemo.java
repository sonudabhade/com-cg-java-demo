package com.cg.oop;


public class MethodDemo {
	
//	returnType methodName(arguments) {
//	statements;
//} 
	
	
	static void someMethod() {
		System.out.println("some output");
	}
	
	static void Addition(int a, int b) { //parameter (variable in method)
		int c;
		c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		//Method c1 = new Method();
		System.out.println("start");
		
		someMethod();
		Addition(10, 20); //arguments(values in method call)
		Addition(30, 20);
		Addition(40, 20);
	}
}
