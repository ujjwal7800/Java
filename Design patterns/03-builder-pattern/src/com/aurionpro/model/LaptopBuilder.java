package com.aurionpro.model;

public class LaptopBuilder {

	public Laptop laptop;

	public LaptopBuilder() {
		super();
		this.laptop = new Laptop();
	}

	public LaptopBuilder addId(int id) {
		this.laptop.setId(id);
		return this;
	}

	public LaptopBuilder addBrand(String brand) {
		this.laptop.setBrand(brand);
		return this;
	}

	public LaptopBuilder addHdd(String hdd) {
		this.laptop.setHdd(hdd);
		return this;
	}

	public LaptopBuilder addProcessor(String processor) {
		this.laptop.setProcess(processor);
		return this;
	}

	public LaptopBuilder addRam(String ram) {
		this.laptop.setRam(ram);
		return this;
	}

	public LaptopBuilder addTouchscreen(boolean touchscreen) {
		this.laptop.setTouchScreen(touchscreen);
		return this;
	}

	public Laptop getLaptop() {
		return laptop;
	}
}
