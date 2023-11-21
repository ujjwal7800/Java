package com.aurionpro.model;

public class Rectangle {
	private int heigth;
	private int width;
	public Rectangle(int heigth, int width) {
		super();
		this.heigth = heigth;
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectange [heigth=" + heigth + ", width=" + width + "]";
	}
	
	

}
