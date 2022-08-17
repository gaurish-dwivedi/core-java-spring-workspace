package com.java.design_patterns.state;

public class Vibrate implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("Mobile is in Vibration mode");

	}

}
