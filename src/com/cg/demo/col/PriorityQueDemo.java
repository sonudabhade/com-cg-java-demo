package com.cg.demo.col;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueDemo {
          public static void main(String[] args) {
			
        	  Queue<Integer> que = new PriorityQueue<Integer>();
        	  
        	  que.add(10);
        	  que.add(20);
        	  que.add(30);
        	  que.add(40);
        	  
        	  System.out.println(que);
        	  System.out.println(que.peek());
        	  System.out.println(que.poll());
        	  System.out.println(que.peek());
        	  System.out.println(que);
        	  System.out.println(que.peek());
        	  System.out.println(que.poll());
        	  System.out.println(que.peek());
        	  System.out.println(que);
        	  
		}
}
