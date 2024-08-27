package com.evergent.corejava.abstract1;
abstract class Products {
	abstract public void myProduct();
	public void allProducts() {
		System.out.println("All Products");
	}
}
public class ProductImpl2 extends Products {
	public void myProduct() {
		System.out.println("my new product");
	}
	public void show() {
		System.out.println("local method of productimpl class");
	}

	public static void main(String[] args) {
		Products p = new ProductImpl2();
		p.allProducts();
		p.myProduct();
		

	}

}
