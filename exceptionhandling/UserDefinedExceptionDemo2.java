package com.evergent.corejava.exceptionhandling;
class InsuffiecientFundsException extends Exception{
	public InsuffiecientFundsException(String message) {
		super(message);
	}
}
public class UserDefinedExceptionDemo2 {
	public static void withDraw(double amount) throws InsuffiecientFundsException{
		double balance=500.00;
		if(amount>balance) {
			throw new InsuffiecientFundsException("Insufficient amount");
		}
		else {
			System.out.println("withdraw succesfull");
		}
	}
	public static void main(String[] args) {
		try {
			withDraw(600.00);
		}
		catch(InsuffiecientFundsException e) {
			System.out.println("caught InsuffiecientFundsException"+e.getMessage());
			System.out.println(e);
		}
		System.out.println("program continuous after handling exception");
	}
}
