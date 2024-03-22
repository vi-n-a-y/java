package com.vin.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String args[]) {
		Set<Integer> firstEven = new HashSet<>();
		firstEven.add(2);
		firstEven.add(8);
		firstEven.add(10);
		firstEven.add(4);
		firstEven.add(6);

		System.out.println(firstEven);

		Set<Integer> tenEven = new HashSet<>(firstEven);

		Set<Integer> nextEven = new HashSet<>();
		nextEven.add(16);
		nextEven.add(18);
		nextEven.add(12);
		nextEven.add(14);

		nextEven.add(20);
		System.out.println(nextEven);
		tenEven.addAll(nextEven);
		System.out.println(tenEven);
	}

}
