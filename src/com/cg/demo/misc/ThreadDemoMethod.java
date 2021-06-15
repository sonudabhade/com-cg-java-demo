package com.cg.demo.misc;

public class ThreadDemoMethod extends Thread{
          
	public void run() {
  	  //ThreadDemoMethod obj2 = new ThreadDemoMethod();
  	  //obj2.setName("Sonu");
  	  //System.out.println("Name =" +obj2.getName());
  	  System.out.println("name:"+Thread.currentThread().getName());
  	  System.out.println("Priority:"+Thread.currentThread().getPriority());
    }
	
	public static void main(String[] args) {
        	  ThreadDemoMethod obj = new ThreadDemoMethod();
        	  ThreadDemoMethod obj2 = new ThreadDemoMethod();

        	  obj.setPriority(5);
        	  obj.setPriority(6);
        	 // System.out.println("Thread = "+ obj);
        	  obj.start();
        	  obj2.start();
		}
          
}
