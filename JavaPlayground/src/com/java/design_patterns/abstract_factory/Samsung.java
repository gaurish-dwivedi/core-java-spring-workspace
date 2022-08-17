package com.java.design_patterns.abstract_factory;

public class Samsung extends Device {
	private String ram;

	private String processor;

	public Samsung(String ram, String processor) {
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "Samsung config :-->  ram is - " + this.ram + " and processor type is - " + this.processor;
	}

	@Override
	public String toString() {
		return "Samsung [ram=" + ram + ", processor=" + processor + "]";
	}

}
