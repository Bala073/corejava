package com.evergent.corejava.static1;
public class Person6 {
	 //String name="Bala";
	static String name="Bala";
	int age=23;
	String address="Hyderabad";
	public void display(){
		name="Welcome";
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}
	public static void main(String[] args) {
		Person6 p1 = new Person6();
		System.out.println(p1.name);
		p1.display();
		Person6 p2 = new Person6();
		System.out.println(p2.name);
	}
}
