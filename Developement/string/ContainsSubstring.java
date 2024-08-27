package com.evergent.corejava.String;
//Create a java program that creates a string,checks if it contains a specific 
//substring and then prints out the result
public class ContainsSubstring {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		String substr= "fox";
		boolean contains=str.contains(substr);
		System.out.println("Contains"+" "+substr+":"+contains);

	}

}


