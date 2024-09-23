package com.evergent.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		//Initializing using constructor
		Product p = new Product(10,"laptop",98989);
		//retrieving using getter methods
		System.out.println(p.getPno());
		System.out.println(p.getPname());
		System.out.println(p.getPrice());

	}

}
