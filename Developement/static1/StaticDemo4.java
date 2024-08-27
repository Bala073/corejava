package com.evergent.corejava.static1;
//non-static methods can access  static methods and static variables
public class StaticDemo4 {
	static String cname="India";
	String name="Bala";
	static public void myData(){
		//Cannot make a static reference to the non-static field name
				//System.out.println(name);
		System.out.println("Mydata");
	}
	public void myShow(){
		myData();
		System.out.println("myshow non static method:"+cname);
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		System.out.println(cname);
		myData();
		StaticDemo4 s4 = new StaticDemo4();
		s4.myShow();
		//myShow();
		//Cannot make a static reference to the non-static method myShow() from the type StaticDemo3	
	}
}
