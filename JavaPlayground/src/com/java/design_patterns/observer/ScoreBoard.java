package com.java.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard implements Board {

	private List<Observer> observers;
	private String message;
	private boolean changed;

	public ScoreBoard() {
		super();
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer obj) {

		if (obj == null)
			throw new NullPointerException("No/Blank Obserserver Registered");
		else if (!observers.contains(obj))
			observers.add(obj);

	}

	@Override
	public void unRegister(Observer observer) {

		observers.remove(observer);

	}

	@Override
	public void notifyObserver() {
		if (!changed)
			return;
		else {
			this.changed = false;

			for (Observer observer : this.observers) {

				try {
					observer.update();
				} catch (NullPointerException e) {
					System.out.println(observer.getClass().getSimpleName() +" Board is not suscribed");
				}

			}

		}

	}

	@Override
	public String getUpdate(Observer obj) {
		return this.message;
	}

	public void postMessage(String message) {
		this.message = message;
		System.out.println("Message Posted --> " + message);
		this.changed = true;
		notifyObserver();
	}
}
