package com.evergent.corejava.abstract1;
abstract class Product {
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("All Products");
	}
}
public class ProductImpl extends Product {
	public void newProduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local method of productimpl class");
	}

	public static void main(String[] args) {
		ProductImpl p = new ProductImpl();
		p.allProducts();
		p.newProduct();
		p.show();

	}

}
