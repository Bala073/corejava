package com.evergent.corejava.String;

import java.util.Arrays;

public class StringPerformance4 {

	public static void main(String[] args) {
		String name= "JavaTechnologies";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('T'));
		System.out.println("     JAVA    ".strip());

	}

}
