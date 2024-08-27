package com.evergent.corejava.String;

public class StringBufferExample6 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Initial String:"+sb);
		sb.reverse();
		System.out.println("After reverse:"+sb);

	}

}
