package com.evergent.corejava.oops;

public class Person {
	String pname="Balakishan";
	int page=23;
	String paddress="Hyderabad";
	public void display()
	{
		System.out.println("Person name: "+pname+"\nPerson age: "+page+"\nperson address: "+paddress);
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.display();

	}

}
