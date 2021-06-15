package com.cg.demo.fun;

public class SampleDemo {
        public static void main(String[] args) {
        	
        	SampleInterface obj = new SampleInterface() {
				
				@Override
				public void anotherAbstractMethod() {
					// TODO Auto-generated method stub
					System.out.println("anotherAbstractMethod");

				}
				
				@Override
				public void anAbstractMethod() {
					// TODO Auto-generated method stub
					System.out.println("anAbstractMethod");
				}
			};
        	
			
			obj.anAbstractMethod();
			obj.anotherAbstractMethod();
			obj.aDefaultMethod();
			obj.anotherDefaultMethod();
			SampleInterface.aStaticMethod();
			SampleInterface.anotherStaticMethod();
		} 
}
