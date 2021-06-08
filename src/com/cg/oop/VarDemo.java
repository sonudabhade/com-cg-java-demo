package com.cg.oop;


class Abc{
	int num5;
	static int num6;
}
public class VarDemo {

	//fields
	int num1;   //instance variable/field
	static int num2;  //static variable/field
	
	void m1() {
		//local variable
		int num3;
	}
	public static void main(String[] args) {
		System.out.println(VarDemo.num2);
		
		System.out.println(Abc.num6);
		Abc a = new Abc();
		System.out.println(a.num5);
		
		int num4=10;  //it's necessary to initialized
		System.out.println(num4);
	}
}
