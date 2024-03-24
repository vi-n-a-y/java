package com.vin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("English", 92);
		marks.put("maths", 90);
		marks.put("science", 85);
		marks.put("social", 95);
		marks.put("second Language", 82);

		System.out.println(marks);
		Set<String> keys = marks.keySet();
		System.out.println(keys);
		Collection<Integer> values = marks.values();
		System.out.println(values);

		if (marks.containsValue(85)) {
			System.out.println("value is exist");
		} else {
			System.out.println("value is not exist");
		}
		if (marks.containsKey("maths")) {
			System.out.println("key is exists");
		} else {
			System.out.println("key not exists");
		}

		for (String key : marks.keySet()) {
			System.out.println("key :" + key + ", values : " + marks.get(key));
		}
	}

}
