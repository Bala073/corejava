package com.evergent.corejava.String;

public class StringBufferExample2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Initial String:"+sb);
		sb.insert(5, "Beautiful");
		System.out.println(sb);

	}

}
