package com.evergent.corejava.String;

public class StringBufferExample4 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello World");
		System.out.println("Initial String:"+sb);
		sb.delete(0,5);
		System.out.println("After delete:"+sb);

	}

}
