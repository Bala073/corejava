package com.evergent.corejava.final1;
//final methods cannot be overrided
final class Demo{
	final public void myProducts(){
		System.out.println("All Products");
	}
}
public class FinalDemo3 {
	final String name = "bala";
	public void myProducts1(){
		System.out.println("myproducts");
	}	
public void myData(){
	//name="ram";
	//The final field FinalDemo2.name cannot be assigned
	System.out.println(name);
}
	public static void main(String[] args) {
		FinalDemo3 fd1= new FinalDemo3();
		Demo m = new Demo();
		fd1.myData();
		m.myProducts();	
	}
}
