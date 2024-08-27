package com.evergent.corejava.final1;
//we cannot modify final variable
public class FinalDemo1 {
	final String name = "bala";
	public void myData()
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		FinalDemo1 fd1 = new FinalDemo1();
		fd1.myData();	
	}
}
