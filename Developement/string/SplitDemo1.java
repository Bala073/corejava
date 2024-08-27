package com.evergent.corejava.String;
//write a program to split the text on spaces.
public class SplitDemo1 {

	public static void main(String[] args) {
		String str = "Java is a powerful programming language";
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}

	}

}
