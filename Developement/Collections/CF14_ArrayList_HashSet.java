package com.evergent.corejava.collections;
import java.util.*;
public class CF14_ArrayList_HashSet {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("COREJAVA");
		list.add("J2EE");
		list.add("J2SE");
		list.add("MYJAVA");
		System.out.println(list);
		Set<String> s = new HashSet<>();
		s.addAll(list);
		System.out.println(s);
		Set<String> s1=new HashSet<>();
		s1.add("COREJAVA");
		s1.add("J2EE");
		s1.add("J2SE");
		s1.add("MYJAVA");
		s1.add("COREJAVA");
		//s1.add("Hello");
		if(s.equals(s1)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		System.out.println(s.containsAll(s1));
	}
}
