package com.cg.demo.method;

/*Access Specifier/Modifier
 * private- can be access only from within class.
 * <package> or(default)- can be access only from within package.
 * protected-can be access from package and the subclass.
 * can be accessed from anywhere within the program.
 * 
 * class, interface, enum - public, <package>
 * fields, methods and constructors - all.

*/


public class DemoClass {

	public int publicField = 10;
	protected int protectedField = 20;
	int packageField = 30;
	private int privateField =40;
	
	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		System.out.println(obj.publicField);
		System.out.println(obj.protectedField);
		System.out.println(obj.packageField);
		System.out.println(obj.privateField);
	}
	
	
	
	
}
