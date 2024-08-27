package com.evergent.corejava.String;
//Write a java program to create a string,remove all spaces from the string 
//and then print out the result.
public class RemoveSpaces {

	public static void main(String[] args) {
		String str = "Hello World,this is a test";
		String nospace = str.replace(" ","");
		System.out.println(nospace);

	}

}
