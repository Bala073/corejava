package com.evergent.corejava.String;

public class StringBufferExample5 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Initial String:"+sb);
		sb.append("World");
		System.out.println("After Append:"+sb);

	}

}
