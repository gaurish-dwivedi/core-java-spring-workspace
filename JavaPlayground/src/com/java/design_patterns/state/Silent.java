package com.java.design_patterns.state;

public class Silent implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("Mobile is in Silent Mode");

	}

}
