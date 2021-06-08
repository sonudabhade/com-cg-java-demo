package com.cg.demo.ex;


class Parent{
	int num = 5;
	
	public Parent() {
		System.out.println("Parent constructor");
	}
}

class Child extends Parent{
	int num = 10;
	
	public Child() {
		System.out.println("child constructor");
		//super();
	}
	public Child(int num) {
		super();
		this.num = num;
	}
	
	public void someMethod() {
		System.out.println(super.num);  // super class member
		System.out.println(this.num);  //current class

}
}
public class ThisSuperDemo {

	
          public static void main(String[] args) {
			
        	  Child child = new Child();
        	  child.num =10;
        	  child.someMethod();
        	  
		}
}
