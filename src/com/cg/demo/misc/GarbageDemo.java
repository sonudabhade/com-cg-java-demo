package com.cg.demo.misc;
import com.cg.demo.abs.EmployeeAbst;
public class GarbageDemo {
	public static void main(String[] args) {

		EmployeeAbst emp1 = new EmployeeAbst();
		EmployeeAbst emp2 = new EmployeeAbst();
		EmployeeAbst emp3 = new EmployeeAbst();
		emp2 = null;  // emp2 is null so it will automatically deleted by garbage collection and free the memory
		emp3 = emp1;   //emp1 also deleted because that data goes in emp3 so, emp1 not needed

	}

}