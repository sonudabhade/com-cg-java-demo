package com.cg.demo.fun;


interface StringFunction {
	  String run(String str);
	}
public class LambdaExe2 {
	public static void main(String[] args) {
	        StringFunction exclaim = (s) -> s + "!";
	        StringFunction ask = (s) -> s + "?";
	        printFormatted("Hello", exclaim);
	        printFormatted("Hello", ask);
	        printFormatted("How Are You", ask);
	        printFormatted("OMG", exclaim);
	    }
	      public static void printFormatted(String str, StringFunction format) {
	        String result = format.run(str);
	        System.out.println(result);
	      }   
	    
	  }
	