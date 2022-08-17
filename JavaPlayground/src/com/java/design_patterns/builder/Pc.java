package com.java.design_patterns.builder;

public class Pc {

	private String os;
	private String gpu;
	private String processor;
	private String ram;
	private String space;

	public Pc(String os, String gpu, String processor, String ram, String space) {
		super();
		this.os = os;
		this.gpu = gpu;
		this.processor = processor;
		this.ram = ram;
		this.space = space;
	}

	@Override
	public String toString() {
		return "Pc [os=" + os + ", gpu=" + gpu + ", processor=" + processor + ", ram=" + ram + ", space=" + space + "]";
	}

}
