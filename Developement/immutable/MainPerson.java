package com.evergent.corejava.immutable;
 class PersonImmutable{
	private final String name;
	private final int age;
	public PersonImmutable(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String myName() {
		return name;
	}
	public int myAge(){
		return age;
	}
}
public class MainPerson {
	public static void main(String[] args) {
		PersonImmutable person = new PersonImmutable("Bala",23);
		System.out.println(person.myName());
		System.out.println(person.myAge());
	}
}
