package com.evergent.corejava.oops;

public class Has_A_RelationDemo {
	public void show()
	{
		System.out.println("Show method");
	}

	public static void main(String[] args) {
		Has_A_RelationDemo has=new Has_A_RelationDemo();
		has.show();
		Person person=new Person();
		person.display();
	

	}

}
