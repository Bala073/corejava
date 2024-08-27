package com.evergent.corejava.String;
//Write a java program to create a string,reverse the order of its
//characters,and then print out the result.
public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World!";
		StringBuilder reversed = new StringBuilder(str).reverse();
		System.out.println(reversed);

	}

}
