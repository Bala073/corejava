package com.evergent.corejava.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo5 {

	public static void main(String[] args) {

		TreeSet myset = new TreeSet();
		myset.add(77);
		myset.add(32);
		myset.add(98);
		myset.add(7);
		myset.add(76);
		System.out.println(myset);
		
		Iterator i = myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
