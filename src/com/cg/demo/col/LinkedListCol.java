package com.cg.demo.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCol {
     public static void main(String[] args) {
    	 //List<EmployeeCol> empList = new ArrayList<EmployeeCol>();
		LinkedList l1 = new LinkedList();
        l1.add(10);
        l1.add(10.5);
        l1.add("ABC");
        
        for(int num = 0; num < l1.size(); num++) {
        	System.out.println("Using for loop:"+l1.get(num));
        }
        
//        for (LinkedListCol obj: l1) {
//        	System.out.println(obj.toString()); 
//        }
        
        Iterator i = l1.iterator();
        while (i.hasNext()) {
        	System.out.println("Using Iterator"+i.next());
        }
     }
}
