package com.aurionpro.model;

public class InsufficientFundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	double balance,amount;
	public InsufficientFundsException(double balance, double amount) {
		this.balance=balance;
		this.amount=amount;
	}

	public InsufficientFundsException(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return getClass().getSimpleName()+" :\t"+"Balance = "+balance+"\t Withdrawl Amount = "+amount;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName()+" :\t"+"Balance = "+balance+"\t Withdrawl Amount = "+amount;
	}
	
}