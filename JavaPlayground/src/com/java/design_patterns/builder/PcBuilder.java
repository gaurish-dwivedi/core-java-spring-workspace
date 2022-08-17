package com.java.design_patterns.builder;

public class PcBuilder {

	private String os;
	private String gpu;
	private String processor;
	private String ram;
	private String space;

	public PcBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PcBuilder setGpu(String gpu) {
		this.gpu = gpu;
		return this;
	}

	public PcBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PcBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}

	public PcBuilder setSpace(String space) {
		this.space = space;
		return this;
	}

	public Pc getCustomPc() {
		return new Pc(os, gpu, processor, ram, space);
	}

}
