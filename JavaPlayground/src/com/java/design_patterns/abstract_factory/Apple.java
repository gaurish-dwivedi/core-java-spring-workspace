package com.java.design_patterns.abstract_factory;

public class Apple extends Device {

	private String ram;

	private String processor;

	public Apple(String ram, String processor) {
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "Apple config :-->  ram is - " + this.ram + " and processor type is - " + this.processor;
	}

	@Override
	public String toString() {
		return "Apple [ram=" + ram + ", processor=" + processor + "]";
	}
}
