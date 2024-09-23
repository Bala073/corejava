package com.evergent.corejava.collectionsclass;
import java.util.*;
public class CC4_CollectionsShuffle {
	/*
	 *Collections.shuffle()
	This method randomly shuffles the elements in the specified list.
	 */
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Pineapple");

        // Display the original list
        System.out.println("Original list: " + fruits);

        // Shuffling the list
        Collections.shuffle(fruits);

        // Display the shuffled list
        System.out.println("Shuffled list: " + fruits);


	}

}
