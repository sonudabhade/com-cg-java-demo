package com.cg.demo.method;

public class Product {
     int quantity;
     String name;
     double price;
      
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int quantity, String name, double price) {
		super();
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}
	
	public Product(int quantity, String name) {
		super();
		this.quantity = quantity;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product [quantity=" + quantity + ", name=" + name + ", price=" + price + "]";
	}
	
	
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
//     
//     
//     Product (){
// 		System.out.println("this is Default Constructor of Product"); 
// 	 }
// 	 
// 	 
// 	 Product (int quant, String name1){
// 			
// 		    this.quantity=quant;
// 			this.name=name1;
// 		    System.out.println("this is Two Parameterized constructor of Product"); 
// 		 }
// 	 
// 	 //parameterized constructor
// 	 Product (int id1, String name1, double price){
// 			
// 		    this.quantity=id1;
// 			this.name=name1;
// 			this.price=price;
// 		    System.out.println("this is Three Parameterized constructor of Product"); 
// 		 }
// 		 
//     
//     
//	@Override
//	public String toString() {
//		return "Product [quantity=" + quantity + ", name=" + name + ", price=" + price + "]";
//	}
//     
//     
//     
     
}
