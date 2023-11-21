package com.aurionpro.model;

public class PrintValue<T> {
	private T value;

	public PrintValue(T value) {
		super();
		this.value = value;
	}

	public PrintValue(Rectangle rectangle) {
		// TODO Auto-generated constructor stub
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "PrintValue [value=" + value + "]";
	}
	
	public void print() {
		System.out.println(value);
	}
	}


