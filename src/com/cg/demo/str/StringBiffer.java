package com.cg.demo.str;

public class StringBiffer {
         public static void main(String[] args) {
			
        	 
        	 String str = "abcd";
        	 System.out.println(str);
        	 str.concat("efg");
        	 System.out.println(str);
        	 
        	 StringBuffer stb = new StringBuffer("ABCD");
        	 System.out.println(stb);

        	 stb.append("EFGH");
        	 System.out.println(stb);
        	 
         }
}
