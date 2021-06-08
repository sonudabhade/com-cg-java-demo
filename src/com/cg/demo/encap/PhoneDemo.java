package com.cg.demo.encap;




public class PhoneDemo {
       public static void main(String[] args) {
		  
    	  Phone phone = new Phone();
		  phone.call();
		  phone.sms();
		  
		  FeaturePhone featurephone = new FeaturePhone();
		  featurephone.music();
		  featurephone.call();
		  featurephone.sms();
		  
		  SmartPhone sp = new SmartPhone();
		  sp.camera();
		  sp.call();
		  sp.sms();
		  sp.music();
	}
}
