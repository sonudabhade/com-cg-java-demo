package com.cg.labbook;

import java.util.Scanner;

public class ReverseSortArray {
    
//	  public static int[] getSorted(int[] a){
//	      int temp;
//	      for(int i=0;i<a.length;i++) {
//	          for(int j=i+1;j<a.length;j++) {
//	              if(a[i]>a[j]) {
//	                  temp=a[i];
//	                  a[i]=a[j];
//	                  a[j]=temp;
//	                  
//	                  
//	              }
//	          }
//	          System.out.println("Ascending"+a[i]);
//	          
//	          
//	      }
//	      
//	       return a;
//	   
//	  }
//	  
	  
	  public static void main(String[] args) {
	      Scanner sc =new Scanner(System.in);
	      System.out.println("Enter intager array size:");
	      int size=sc.nextInt();
	      int[] a= new int[size];
	     
	 

	      for(int i=0;i<a.length;i++) {
	          System.out.println("Enter  array element:");
	          a[i]=sc.nextInt();
	          //ReverseSortArray.getSorted(a);
	          
	      }
	      System.out.println("");
	      for(int i=0;i<a.length;i++) {
	          System.out.println("you have Enter  elements:"+a[i]);
	      }
	      
	      
	      
//	      a=getSorted(a);   
//	    System.out.println("Sorted Array:"+a[i]);
	      
//	     System.out.println("Elements of array sorted in ascending order: ");     // elements of array after sorting    
//	      for (int i = 0; i < a.length; i++) { 
//	          System.out.print(ReverseSortArray.getSorted(a) + " ");  
//	          
//	      }   
	   
	}


		  
}


