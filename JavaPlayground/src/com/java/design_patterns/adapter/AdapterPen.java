package com.java.design_patterns.adapter;

public class AdapterPen implements Pen {

	FountainPen fp = new FountainPen();

	@Override
	public void write(String data) {
		fp.inked(data);

	}

}
