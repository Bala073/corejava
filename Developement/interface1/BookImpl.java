package com.evergent.corejava.interface1;

public class BookImpl implements Book {
	public void bookTitle() {
		System.out.println("Core Java");
	}
	public void bookAuthor() {
		System.out.println("Oracle crop"+cname);
	}
	public void bookPrice()
	{
		System.out.println("Rs 550");
	}
	public void show() {
		System.out.println("local method of bookimpl");
	}

	public static void main(String[] args) {
		BookImpl book1 = new BookImpl();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();

	}

}
