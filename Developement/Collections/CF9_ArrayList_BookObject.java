package com.evergent.corejava.collections;

import java.util.ArrayList;

class Book{
	String name;
	public Book(String name) {
		this.name=name;	
	}
	public String toString() {
		return name;
	}
}
public class CF9_ArrayList_BookObject {

	public static void main(String[] args) {
		Book b1 = new Book("Java");
		Book b2 = new Book("CoreJava");
		Book b3 = new Book("Let Us See");
		ArrayList mylist = new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		System.out.println(mylist);
	}
}
