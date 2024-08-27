package com.evergent.corejava.String;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Initial String:"+sb);
		
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());

	}

}
