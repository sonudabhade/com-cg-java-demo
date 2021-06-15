package com.cg.demo.col;

import java.util.ArrayList;

public class CollectionDemo1 {
       public static void main(String[] args) {
		
    	   //No Type Specification
    	ArrayList<Comparable> al = new ArrayList<Comparable>();
		al.add(20);  //auto boxing
		al.add(10.5);  //duplicates
		al.add("Sonu");  // hetrogenous data allowed
		//al.add(new Integer(10));  // boxing
		System.out.println("No Type Specification"+al);
		
		
		//With Type Specification
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		//al2.add(new Integer(10));
		al2.add(15);
		//al2.add(10.5);  //CE: not allowed
		//al2.add("Sonu");  // CE:
		System.out.println("with Type Specification"+al2);
	}
}
