package com.cg.demo.fun;

//functional interface
//which contains only one abstract method
//which may contains one or more OTHER Methods

@FunctionalInterface
public interface FunInterface {
        
	public abstract void functionalMethod(int i);
	//public abstract void anfunctionalMethod(); //CE functional interface contain only one abstract

}
