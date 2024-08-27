package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo6 {
	//String name=null;
	String name="null";
	public void myData() {
		try
		{
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("end");
		}
		finally
		{
			System.out.println("finally block close connections");
		}
	}

	public static void main(String[] args) {
		ExceptionDemo6 ed2 = new ExceptionDemo6();
		ed2.myData();

	}

}
