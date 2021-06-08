package com.cg.demo.encap;



public class EncapDemo {
	
        public static void main(String[] args) {
			//BankCustomer b1 = new BankCustomer();
			//b1.balance = 10000;  //CE
		
			//System.out.println(b1.checkBalance());
		
		    //b1.deposit(15000);
			//System.out.println(b1.checkBalance());

			//b1.withdraw(2000.0);
			//System.out.println(b1.checkBalance());
			//System.out.println(b1.toString());

        	Demo demo =new Demo();
        //	demo.num = 10;
        	
        
        	demo.setBalance(10000.0);
            System.out.println("Balance is: " +demo.getBalance()); 
            demo.setNum(10);
            System.out.println("Number is: " +demo.getNum()); 
            
            
          
        }
        

}
