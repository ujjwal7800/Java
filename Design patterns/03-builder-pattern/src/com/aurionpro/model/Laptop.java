package com.aurionpro.model;

public class Laptop implements IGadget{
	private int id;
	private String brand;
	private String hdd;
	private String process;
	private String ram;
	private boolean touchScreen;

	public Laptop() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public boolean isTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", hdd=" + hdd + ", process=" + process + ", ram=" + ram
				+ ", touchScreen=" + touchScreen + "]";
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getProcessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTouchscreen() {
		// TODO Auto-generated method stub
		return false;
	}

}
