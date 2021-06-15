package com.cg.demo.col;

import java.util.Vector;  
public class VectorDemo {  
       public static void main(String args[]) {  
          //Create a vector  
          Vector<String> vec = new Vector<String>();  
          System.out.println("Intial size: "+vec.size());  
          System.out.println("Intial capacity: "+vec.capacity());  

          //Adding elements using add() method of List  
          vec.add("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
          vec.add("Elephant");  
          //Adding elements using addElement() method of Vector  
          vec.addElement("Rat");  
          vec.addElement("Cat");  
          vec.addElement("Deer");  
            
          System.out.println("Elements are: "+vec); 
          System.out.println("After Added Element size: "+vec.size());  
          System.out.println("After Added 1st Element: "+vec.firstElement());
          System.out.println("get : "+vec.get(5));  
          System.out.println("Intial capacity: "+vec.capacity());  
  

       }  
}  