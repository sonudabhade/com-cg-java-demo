package com.cg.demo.abs;

interface CentralGovtRules{
	public abstract void payInterest();
}
interface StateGovtRules{
	public abstract void giveLoan();
}

abstract class RBI{
	public abstract void doKyc();
	public void openAccount() {
		System.out.println("open account");
	}
}

class HDFC extends RBI implements CentralGovtRules, StateGovtRules {
	public  void doKyc(){
		System.out.println("Using Adhar");
	}
	public  void giveLoan(){
		System.out.println("HDFC is give load");
	}
	public  void payInterest(){
		System.out.println("HDFC is paying interest..");
	}
}

class ICICI extends HDFC {
	public  void createAcount(){
		System.out.println("Account in ICICI");
	}
//	public  void giveLoan(){
//		System.out.println("HDFC is give load");
//	}
//	public  void payInterest(){
//		System.out.println("HDFC is paying interest..");
//	}
}

public class BankingDemo {
          public static void main(String[] args) {
			HDFC hdfc = new HDFC();
			hdfc.openAccount();
			hdfc.doKyc();
			hdfc.giveLoan();
			hdfc.payInterest();
			
			ICICI icici = new ICICI();
			icici.openAccount();
			icici.doKyc();
			icici.giveLoan();
			icici.payInterest();
		}
}
