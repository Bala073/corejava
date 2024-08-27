package com.evergent.corejava.exceptionhandling;
 class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message) {
		super(message);
	}
}
public class UserDefinedUncheckedExceptionDemo3 {
	public static void validateScore(int score) {
		if(score<0||score>100) {
			throw new InvalidScoreException("score must be between 0 and 100");
		}
		else {
			System.out.println("score is valid");
		}
	}
	public static void main(String[] args) {
		try {
			validateScore(110);
		}
		catch(InvalidScoreException e) {
			System.out.println("caught the exception"+ e.getMessage());
		}
	}
}
