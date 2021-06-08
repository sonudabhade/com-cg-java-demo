package com.cg.demo.encap;

//Encapsulation - binding data and code together.
//Make Fields as Private and
//Create Getter and Setter Method

public class Demo {
	private int num;
    private double balance;
    
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
    
}
