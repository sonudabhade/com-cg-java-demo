package com.cg.demo.misc;

public class ThreadDemo2 implements Runnable {
        public void printLoop() {
			for(int i =1; i <= 10; i++) {
				try {
					Thread.sleep(250);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
        
        public void run() {
        	this.printLoop();
        	Thread th = Thread.currentThread();
            System.out.println("r:"+th.isAlive());

        }
        
        
        public static void main(String[] args) {
			
        	Thread obj1 = new Thread(new ThreadDemo2());
        	Thread obj2 = new Thread(new ThreadDemo2());
        	Thread obj3 = new Thread(new ThreadDemo2());
             obj1.start();
             //obj1.join();
             obj2.start();
             System.out.println("m:"+obj1.isAlive());
//             obj1.printLoop();
//             obj2.printLoop(); 
             
		}
}
