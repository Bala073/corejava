package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutofBoundException  {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		try {
			System.out.println(num[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught the exception "+e);
		}
		System.out.println("program continuous after handling exception");
	}

}
