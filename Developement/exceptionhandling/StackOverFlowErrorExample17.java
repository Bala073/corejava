package com.evergent.corejava.exceptionhandling;

public class StackOverFlowErrorExample17 {

	public static void main(String[] args) {
		try {
			recursivemethod();
		}
		catch(StackOverflowError e) {
			System.out.println("stackoverflow error caught: "+ e.getMessage());
		}

	}
	public static void recursivemethod() {
		recursivemethod();
	}

}
