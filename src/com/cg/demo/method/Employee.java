package com.cg.demo.method;


/*  
 * Constructor-
 * It is used to create and intialize object.
 * It is special type of method in java.
 * it does not have any return type.
 * By default java provides one default constructor
 * constructor name is same as class name.
 * we can create our own constructors.
 * if we create our own constructor, jAVA DOES NOT PROVIDE ANY CONSTRUCTORS.
 * */

public class Employee {

	 int id;
	 public String name;
	 double salary;
	 
	 public Employee(){
		System.out.println("this is Default Constructor Employee method"); 
	 }
	 
	 
	 Employee(int id1, String name1){
			
		    this.id=id1;
			this.name=name1;
		    System.out.println("this is Two Parameterized constructor"); 
		 }
	 
	 //parameterized constructor
	 Employee(int id1, String name1, double salary1){
			
		    this.id=id1;
			this.name=name1;
			this.salary=salary1;
		    System.out.println("this is Three Parameterized constructor"); 
		 }
		 
	 
	 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
