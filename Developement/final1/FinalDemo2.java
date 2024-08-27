package com.evergent.corejava.final1;
//final methods cannot be overrided
class Myclass{
	final public void myProducts(){
		System.out.println("All Products");
	}
}
public class FinalDemo2 extends Myclass{
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
		FinalDemo2 fd1= new FinalDemo2();
		fd1.myData();
		fd1.myProducts();	
	}
}
