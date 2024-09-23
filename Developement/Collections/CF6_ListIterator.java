package com.evergent.corejava.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CF6_ListIterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("ramu");
		list.add("ravi");
		list.add("bala");
		list.add("bhanu");
		ListIterator li = list.listIterator();
		li.add("welcome");
		li.add("Hello");
		while(li.hasNext()) {
			String s=(String)li.next();
			System.out.println(s);
			if(s.equals("bala")) {
				li.remove();
			}
		}
			while(li.hasPrevious()) {
				System.out.println(li.previous());
			}
	}
}
