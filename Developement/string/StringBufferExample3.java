package com.evergent.corejava.String;

public class StringBufferExample3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Initial String:"+sb);
		sb.replace(0,5,"Hi");
		System.out.println("After replace:"+sb);

	}

}
