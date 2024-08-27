package com.evergent.corejava.interface1;
//we cannot create object to interface but we can create reference to interface
public class BookImpl2 implements Book {
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
		Book book1 = new BookImpl2();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		

	}

}
