package com.vin;

import java.util.ArrayList;
import java.util.List;

public class EvenOrOddList {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				list1.add(i);
			} else {
				list2.add(i);
			}

		}
		System.out.println(list1);
		System.out.println(list2);

	}

}
