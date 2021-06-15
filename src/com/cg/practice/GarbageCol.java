package com.cg.practice;

public class GarbageCol { 
	 public void finalize(){
		 System.out.println("object is garbage collected");
	}  
	 public static void main(String args[])
	 {  
		 GarbageCol s1=new GarbageCol();  
		 GarbageCol s2=new GarbageCol();  
	  s1=null;  
	  s2=null;  
	  System.gc();  
	 }  
}  