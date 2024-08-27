package com.evergent.corejava.interface1;

public class BookImpl3 implements Book,NewBook {
	public void bookTitle() {
		System.out.println("Core Java");
	}
	public void bookAuthor() {
		System.out.println("Oracle crop"+cname);
	}
	public void bookPrice(){
		System.out.println("Rs 550");
	}
	public void show() {
		System.out.println("local method of bookimpl");
	}
	public void myNewBook() {
		System.out.println("My new Book");
	}
	public void dataInfo() {
		System.out.println("my data info");
	}
	public static void main(String[] args) {
		BookImpl3 book1 = new BookImpl3();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
		book1.myNewBook();
		book1.dataInfo();
	}
}
