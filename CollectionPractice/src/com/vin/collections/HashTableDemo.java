package com.vin.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(11, "a");
		ht.put(25, "b");
		ht.put(45, "c");
		ht.put(15, "d");
		ht.put(61, "e");
		ht.put(29, "i");
		ht.put(38, "k");
		ht.put(50, "r");
		System.out.println(ht);
		for (Map.Entry m : ht.entrySet()) {
			System.out.println("Key is : " + m.getKey() + "," + "Value is : " + m.getValue());
		}

	}

}
