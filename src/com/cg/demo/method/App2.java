package com.cg.demo.method;

public class App2 {
   public static void main(String[] args) {
	   
	   
	   
	// class object = new constructor
       Product obj = new Product();
       
       obj.quantity = 1;
       obj.name = "Apple phone";
       obj.price = 10.5;
       System.out.println(obj.toString());

       Product obj3 = new Product(3, "Samsung", 10.25);
       System.out.println(obj3.toString());
       
       Product obj4 = new Product(4, "One-plus");
       System.out.println(obj4.toString());
       
       
//       Employee obj5 = new Employee(104, "qwe");
//       System.out.println(obj5.toString());
     }
}
