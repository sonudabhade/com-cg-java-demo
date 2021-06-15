package com.cg.demo.misc;

//public class ThreadDemo3 extends Thread {
//	  public static void main(String[] args) {
//		    ThreadDemo3 thread = new ThreadDemo3();
//		    thread.start();
//		    System.out.println("This code is outside of the thread");
//		  }
//		  public void run() {
//		    System.out.println("This code is running in a thread");
//		  }
//}

//public class ThreadDemo3 implements Runnable {
//	  public static void main(String[] args) {
//		  ThreadDemo3 obj = new ThreadDemo3();
//	    Thread thread = new Thread(obj);
//	    thread.start();
//	    System.out.println("This code is outside of the thread");
//	  }
//	  public void run() {
//	    System.out.println("This code is running in a thread");
//	  }
//}


//public class ThreadDemo3 extends Thread {
//	  public static int amount = 0;
//
//	  public static void main(String[] args) {
//	    ThreadDemo3 thread = new ThreadDemo3();
//	    thread.start();
//	    System.out.println(amount);
//	    amount++;
//	    System.out.println(amount);
//	  }
//
//	  public void run() {
//	    amount++;
//	  }
//}	  

public class ThreadDemo3 extends Thread {
           public static int amount = 0;

           public static void main(String[] args) {
        	   ThreadDemo3 thread = new ThreadDemo3();
             thread.start();
             // Wait for the thread to finish
             while(thread.isAlive()) {
             System.out.println("Waiting...");
           }
           // Update amount and print its value
           System.out.println("Main: " + amount);
           amount++;
           System.out.println("Main: " + amount);
          }
           public void run() {
           amount++;
          }
}
