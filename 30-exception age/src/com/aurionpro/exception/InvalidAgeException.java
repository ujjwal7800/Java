package com.aurionpro.exception;

public class InvalidAgeException extends RuntimeException
{
	public static final long serialVersionUID=1L;
	String message;
	public InvalidAgeException(String message)
	{
		super(message);
		this.message=message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.getClass().getName()+":"+message;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getName()+":"+message;
	}
	

}
