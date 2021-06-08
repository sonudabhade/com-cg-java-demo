package com.cg.demo.asc;

public class AsciiDemo {
           public static void main(String[] args) {
			System.out.println("start");
			for(int i = 1; i <= 256; i++) {
				char ch = (char) i;
				System.out.println(i + "=" + ch);;
			}
		}
}
