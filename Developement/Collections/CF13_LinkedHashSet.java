package com.evergent.corejava.collections;

import java.util.LinkedHashSet;
public class CF13_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Grapes");
		System.out.println("LinkedHashset: "+linkedHashSet);
		System.out.println("Iterating over linkedhashset:");
		for(String fruit:linkedHashSet) {
			System.out.println(fruit);
		}
		System.out.println("contains mango: "+linkedHashSet.contains("Mango"));
		linkedHashSet.remove("Banana");
		System.out.println("Size of linkedHashSet: "+linkedHashSet.size());
		linkedHashSet.clear();
		System.out.println("After clear: "+linkedHashSet);
		}
}
