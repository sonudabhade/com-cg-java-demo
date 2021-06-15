package com.cg.demo.misc;

public class ThreadDemo extends Thread {
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
			
        	ThreadDemo obj1 = new ThreadDemo();
        	ThreadDemo obj2 = new ThreadDemo();
        	ThreadDemo obj3 = new ThreadDemo();
             obj1.start();
             obj2.start();
             //obj1.join();
             System.out.println("m:"+obj1.isAlive());

//             obj2.printLoop(); 
             
		}
}
