package com.evergent.corejava.exceptionhandling;
public class ExceptionDemo5 {
	String name="null";
	//String name = null;
	int k=2;
	public void myData() {
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("end");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle:"+e);	
		}
		catch(ArithmeticException e) {
			System.out.println("I can handle:"+e);
		}
		catch(Exception e) {
			System.out.println("I can handle"+e);
		}
		finally{
			System.out.println("finally block close connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ed3 = new ExceptionDemo5();
		ed3.myData();
	}
}
