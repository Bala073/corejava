package com.evergent.corejava.static1;

public class StaticDemo5 {
	static{
		System.out.println("static block");
	}
		static String cname="india";
		static public void myData(){
			System.out.println("mydata");
		}
	public static void main(String[] args) {
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
	}
}
