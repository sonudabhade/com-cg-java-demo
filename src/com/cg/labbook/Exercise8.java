package com.cg.labbook;

import java.util.Scanner;



public class Exercise8 {
    private static boolean flag;
    private static Object count;

 

 


    public static boolean checkpower(int num) {
        boolean flag = false ;
    
        if (num%2==0) {
            flag=true;
        }
        return flag;
       
    }
    
    
    public static void checkcount(int num) {
        int count=0;
//        if (num%2==0) {
        while(num%2==0) {
           
             count++;
            num=num/2;
        }
        if(num==1)
        {
        System.out.println(count); 
        }
    }

 

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("please enter number");
    int num = sc.nextInt();
    checkpower(num);
    if (flag==true) {
        System.out.println("num is power of 2");
        System.out.println("power is ");
        checkcount(num);    
    }
    else {
        System.out.println("number is not power of 2");
    }
}
}