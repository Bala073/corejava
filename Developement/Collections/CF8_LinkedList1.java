package com.evergent.corejava.collections;

import java.util.LinkedList;

public class CF8_LinkedList1 {

	public static void main(String[] args) {
		LinkedList mylist = new LinkedList();
		mylist.add("TATA");
		mylist.add("BMW");
		mylist.add("VOLVO");
		mylist.addFirst("MARUTHI");
		mylist.addLast("SAFARI");
		mylist.remove(4);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);

	}

}
