package com.cg.demo.col;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
      public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
	
         map.put(20, "India");
         map.put(10, "china");
         map.put(40, "US");
         map.put(30, "UK");
         
         System.out.println(map);
         System.out.println(map.get(20));

         //Traversing Map
         Set set=map.entrySet();//Converting to Set so that we can traverse  
         Iterator itr=set.iterator();  
         while(itr.hasNext()){  
             //Converting to Map.Entry so that we can get key and value separately  
             Map.Entry entry=(Map.Entry)itr.next();  
             System.out.println(entry.getKey()+" "+entry.getValue()); 
      }
}
}
