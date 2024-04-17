package com.vin.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {// TreeMap maintains ascending order.

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(1, "j");
		t.put(5, "a");
		t.put(2, "b");
		t.put(3, "h");
		t.put(4, "i");

//	t.put(null, "r"); doesn't support null keys TreeMap cannot contain any null key.
		t.put(9, null);

		for (Map.Entry m : t.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());

		}
		t.remove(9);
		System.out.println("After removing element in the Map : " + t);

		System.out.println("tail map (greater) : " + t.tailMap(2)); // Returns key-value pairs whose keys are greater
																	// than or equal to the specified key.
		System.out.println("Print in decending order" + t.descendingMap()); // Maintains descending order
		System.out.println("Head Map (lesser) : " + t.headMap(3)); // Returns key-value pairs whose keys are less than
																	// the specified key.
		System.out.println("sub-Map (between) : " + t.subMap(1, 4)); // Returns key-value pairs exists in between the
																		// specified key.
	}

}
