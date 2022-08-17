package com.java.design_patterns.state;

public class Mobile {

	public static void main(String[] args) {

		MobileRingtone mobileRingtone = new MobileRingtone();
		
		
		System.out.println("Default state of mobile");

		mobileRingtone.alert();

		System.out.println("Mobile set to vibrate ");
		
		mobileRingtone.setCurrentState(new Vibrate());

		mobileRingtone.alert();

		System.out.println("Mobile set to silent ");
		
		mobileRingtone.setCurrentState(new Silent());
		
		mobileRingtone.alert();
		
		System.out.println("Mobile set to Ringing ");
		
		mobileRingtone.setCurrentState(new Ringing());
		
		mobileRingtone.alert();
		
		
		
		

	}

}
