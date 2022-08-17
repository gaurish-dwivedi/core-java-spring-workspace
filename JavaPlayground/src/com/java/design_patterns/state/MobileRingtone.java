package com.java.design_patterns.state;

public class MobileRingtone {

	private MobileAlertState currentState;

	public MobileRingtone() {
		this.currentState = new Ringing();
	}

	public void setCurrentState(MobileAlertState currentState) {
		this.currentState = currentState;
	}

	public void alert() {

		currentState.alert();
	}

}
