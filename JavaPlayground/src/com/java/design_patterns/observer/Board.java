package com.java.design_patterns.observer;

public interface Board {

	public void register(Observer obj);

	public void unRegister(Observer observer);

	public void notifyObserver();

	public String getUpdate(Observer obj);
}
