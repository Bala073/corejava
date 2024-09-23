package com.evergent.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_Hashset_Generics {

	public static void main(String[] args) {
		HashSet<Integer> myset = new HashSet<Integer>();
		myset.add(87);
		myset.add(456);
		myset.add(1);
		System.out.println(myset);
		Iterator i = myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(int s: myset) {
			System.out.println(s);
		}

	}

}
