package com.cg.java.pc2;

public class Employee {

	 public int id2;
	 String name2;
	 double salary2;
	 
	 public Employee(){
		System.out.println("this is Default Constructor of Employee pc2"); 
	 }
	 
	 
	 Employee(int id1, String name1){
			
		    this.id2=id1;
			this.name2=name1;
		    System.out.println("this is Two Parameterized constructor"); 
		 }
	 
	 //parameterized constructor
	 Employee(int id1, String name1, double salary1){
			
		    this.id2=id1;
			this.name2=name1;
			this.salary2=salary1;
		    System.out.println("this is Three Parameterized constructor"); 
		 }
		 
	 
	 
	@Override
	public String toString() {
		return "Employee [id=" + id2 + ", name=" + name2 + ", salary=" + salary2 + "]";
	}

	
	
}


