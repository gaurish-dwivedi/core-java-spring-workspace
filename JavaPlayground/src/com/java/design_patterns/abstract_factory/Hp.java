package com.java.design_patterns.abstract_factory;

public class Hp extends Device {

	private String ram;

	private String processor;

	private String gpu;

	public Hp(String ram, String processor, String gpu) {
		this.ram = ram;
		this.processor = processor;
		this.gpu = gpu;
	}

	@Override
	public String getDetails() {
		return "Hp config :-->  ram is - " + this.ram + " and processor type is - " + this.processor + " and gpu is - "
				+ this.gpu;
	}

	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", processor=" + processor + ", gpu=" + gpu + "]";
	}
}
