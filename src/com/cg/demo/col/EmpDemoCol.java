package com.cg.demo.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpDemoCol {
	public static void main(String[] args) {

		EmployeeCol emp = new EmployeeCol();
		Delete delete = new Delete();

		List<EmployeeCol> empList = new ArrayList<EmployeeCol>();

		empList.add(emp);
		empList.add(new EmployeeCol());
		empList.add(new EmployeeCol(103, "Aaa", 10.5));
//		empList.add("Aaa"); // CE
//		empList.add(delete); // CE

//		System.out.println(empList);

		System.out.println("Iterate using for loop");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i).toString());
		}

		System.out.println("Iterate using for each loop");

		for (EmployeeCol e : empList) {
			System.out.println(e.toString());
		}

		System.out.println("Iterate using Iterator");

		Iterator<EmployeeCol> iterator = empList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}