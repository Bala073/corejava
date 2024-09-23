package com.evergent.corejava.collections;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		char ch1='a';
		Character myc = new Character(ch1);
		char ch = myc.charValue();
		System.out.println("value of ch:"+ch);
		System.out.println("value of myc:"+myc);
		

	}

}
