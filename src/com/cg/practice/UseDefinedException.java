package com.cg.practice;

class MyException extends Exception{
	   int a;
	   MyException(int b) {
	     a=b;
	   }
	   public String toString(){
	     return ("Exception Number =  "+a) ;
	   }
}

public class UseDefinedException {
      public static void main(String[] args) {
    	  
    	  try{
   	       throw new MyException(10);
   	       // throw is used to create a new exception and throw it.
   	  }
   	 catch(MyException e){
   	    System.out.println(""+e) ;
   	 }
   }
}
