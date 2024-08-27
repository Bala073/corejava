package com.evergent.corejava.exceptionhandling;
class ProductNotFoundException extends Exception {
	public ProductNotFoundException(String message) {
		System.out.println("Hello"+message);
	}
}
public class ProductImpl {
	int pno=105;
	public void myData() throws ProductNotFoundException{
		if(pno>100) {
			throw new ProductNotFoundException("there are no products");
		}
		else {
			System.out.println("there are products");
		}
	}
	public static void main(String[] args) {
		try {
			ProductImpl product = new ProductImpl();
			product.myData();
		}
		catch(ProductNotFoundException e) {
			System.out.println("I can handle "+e);
		}
	}
}
