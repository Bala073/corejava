package com.evergent.corejava.static1;
//Static methods cannot access non static methods and non static variables
public class StaticDemo3 {
	static String cname="India";
	String name="Bala";
	static public void myData(){
		//Cannot make a static reference to the non-static field name
				//System.out.println(name);
		System.out.println("Mydata");
	}
	public void myShow(){
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		myData();
		//myShow();
		//Cannot make a static reference to the non-static method myShow() from the type StaticDemo3
	}
}
