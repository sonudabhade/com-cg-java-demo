package com.cg.oop;

// static - free access  - window booking
//non static - retricted access - cinema hall

class Employee{
	
	//class is real world entities
	
	int id;  //attribute, fields
	String name;
	double salary;
	
	//functionalities -methods
	void work() {
		System.out.println("Employee works..");
	}
}



public class App {
           public static void main(String[] args) {
			
        	   Employee obj = new Employee();
        	   obj.id = 101;
        	   obj.name = "sonu";
        	   obj.salary = 10.5;
        	   System.out.println(obj.id + " " + obj.name + " " + obj.salary);
		       obj.work(); 
		       
		       
		       
           }
}
