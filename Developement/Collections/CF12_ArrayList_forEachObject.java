package com.evergent.corejava.collections;

import java.util.ArrayList;

public class CF12_ArrayList_forEachObject {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		mylist.add(100);
		mylist.add("ven");
		mylist.add("Bala");
		mylist.add(45.6);
		for(Object o:mylist) {
			System.out.println(o);
		}

	}

}
