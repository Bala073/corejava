package com.evergent.corejava.abstract1;
abstract  class Product3{
	public Product3() {
		System.out.println("product3 abstract class constructor");
	}
	String cname="india";
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("All Products");
	}
}
public class ProductImpl3 extends Product3 {
	public void newProduct() {
		System.out.println("my new Product");
	}
	public ProductImpl3() {
		System.out.println("ProductImpl constructor");
	}

	public static void main(String[] args) {
		ProductImpl3 p = new ProductImpl3();
		p.allProducts();
		p.newProduct();

	}

}
