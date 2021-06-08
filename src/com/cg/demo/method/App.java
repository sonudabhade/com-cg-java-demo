package com.cg.demo.method;

import java.util.Scanner;

public class App {

	 

    public static void main(String[] args) {

 

        int num = 10;
        
 
    // class object = new constructor
        Employee obj = new Employee();
        
        obj.id = 101;
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj.toString());
        
        Employee obj2 = new Employee();
        
        obj2.id = 100;
        obj2.name = "XYZ";
        obj2.salary = 10.9;
        System.out.println(obj2.toString());

        Employee obj3 = new Employee(101, "XZC", 10.25);
        System.out.println(obj3.toString());
        
        Employee obj4 = new Employee(104, "qwe");
        System.out.println(obj4.toString());
        
        //Taking input from user
//        Scanner sc = new Scanner(System.in);
//		  System.out.println("Please enter an integer - ");
//        int num1 = sc.nextInt();
//        String name = sc.next();
//        double sal = sc.nextDouble();
//        Employee obj5 = new Employee(num1, name, sal);
//        System.out.println(obj5.toString());
// 
//        Employee obj6 = new Employee(num1, name);
//        System.out.println(obj6.toString());

        

    }

 

}