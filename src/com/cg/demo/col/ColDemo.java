package com.cg.demo.col;

import java.util.ArrayList;
import java.util.Stack;

public class ColDemo {

	public static void main(String[] args) {

//		int[] numArray = new int[5];
//
//		int[] arr = { 10, 20, 30, 40, 50 }; // not growable not shrinkable
//
//		System.out.println(arr.length);
//
//		for (int i : arr) {
//			System.out.println(i);
//		}

//		List Set Map Queue 
		Stack s = new Stack();
		System.out.println("Size stack: "+s.size());
		s.add(10);
		s.add(20.75);
		System.out.println("Size capacity: "+s.capacity());

		s.add("Abc");
		s.add("Abc");
		s.add("Abc");
		s.add("Abc");
		s.add("Abc");
		s.add("Abc");
		s.add("Abc");
		s.add("Abc");
		s.add("Abc");

		System.out.println("Size stack: "+s.size());
		System.out.println("Size capacity: "+s.capacity());

//		myList.add("B");
//		myList.add("C");

		ArrayList myList = new ArrayList();
		System.out.println("Size 1: "+myList.size());
		myList.add(10);
		myList.add(20.75);
		myList.add("Abc");
		myList.add("B");
		myList.add("C");

		System.out.println("\nSize 2: "+myList.size());
		System.out.println("Array list:"+myList);
	    myList.remove("A");
	    myList.remove(2);
	    System.out.println("\nSize 3:"+myList.size());
		System.out.println("Array list:"+myList);
	   
		for(int i =0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	    
	}
}