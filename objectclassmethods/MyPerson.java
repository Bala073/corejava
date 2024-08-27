package com.evergent.corejava.objectclassmethods;
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Name :"+name+"Age :"+age;
	}
}
public class MyPerson {
	public static void main(String[] args) {
		Person p1 = new Person("Bala",23);
		System.out.println(p1);
	}
}
