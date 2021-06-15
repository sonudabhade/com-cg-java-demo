package com.cg.demo.col;

public class EmployeeCol {
	int id;
	String name;
	double salary;

	public EmployeeCol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeCol(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}