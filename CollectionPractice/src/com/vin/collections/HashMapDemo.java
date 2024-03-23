package com.vin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> students=new HashMap<>();
		students.put(101, "vinay");
		students.put(102, "bala");
		students.put(103, "balu");
		students.put(104, "venu");
		students.put(105,"tiru");
		
		System.out.println(students);
		Set<Integer> keys=students.keySet();
		System.out.println(keys);
		Collection<String> values=students.values();
		System.out.println(values);
		students.remove(105);
		if(students.containsKey(104)) {
			System.out.println("key is exists");
		}else {
			System.out.println("key not exists");
		}
			
		
		

	}

}
