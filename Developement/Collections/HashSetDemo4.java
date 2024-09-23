package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo4 {

	public static void main(String[] args) {
		 HashSet myset = new HashSet();
		myset.add(100);
		myset.add("Hello");
		myset.add(33.3);
		myset.add(100);
		System.out.println(myset);
		
		Iterator i = myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
