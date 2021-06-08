package com.cg.demo.access;

import java.util.Random;

public class RandomDemo {

	
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(1000);
		System.out.println(num);
	}
}
