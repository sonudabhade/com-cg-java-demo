package com.cg.demo.asc;

public class CastingDemo {
  public static void main(String[] args) {
	
	//byte short char int long  
	byte b1 = 1;
	byte b2 = 2;
	//byte b3 = b1 + b2; // byte not supported int 
	int b4 = b1 + b2;   //Automatic type casting   Lower type to Higher Like int=byte
	System.out.println(b4);
	
	byte b5 = (byte) (b1 + b2); //Manual type Casting   Higher to Lower 
	System.out.println(b5);
	
	
	
	int num = 97;
	System.out.println( "\n =" + num);
	
	char grade = (char) num;
	System.out.println( "\n " +grade);
   }
}
