/*Access Specifier/Modifier
 * private- can be access only from within class.
 * <package> or(default)- can be access only from within package.
 * protected-can be access from package and the subclass.
 * can be accessed from anywhere within the program.

*/

package com.cg.demo.access;
//import com.cg.demo.method.*;
//import com.cg.java.pc2.Employee;
import com.cg.demo.method.DemoClass;
//import com.cg.demo.method.Employee;



public class App {
	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		System.out.println(obj.publicField);
//		System.out.println(obj.protectedField);
//		System.out.println(obj.packageField);
//		System.out.println(obj.privateField);
             
		 com.cg.java.pc2.Employee emp = new  com.cg.java.pc2.Employee();
		System.out.println(emp.id2);
		
		com.cg.demo.method.Employee emp2 = new com.cg.demo.method.Employee();
		System.out.println(emp2.name);
	
	}
}
