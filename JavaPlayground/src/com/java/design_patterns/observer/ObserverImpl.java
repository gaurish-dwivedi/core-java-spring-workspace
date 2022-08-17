package com.java.design_patterns.observer;

public class ObserverImpl implements Observer {

	private String name;

	private Board board;
	
	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObserverImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		String msg = board.getUpdate(this);
		if (msg == null)
			System.out.println(name + " No new Messages");
		else
			System.out.println(name + "Consuming message -> " + msg);

	}

	@Override
	public void subscribe(Board board) {
		this.board = board;

	}

}
