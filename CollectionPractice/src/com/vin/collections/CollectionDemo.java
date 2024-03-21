package com.vin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
	public static void main(String args[]) {
		Collection<String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		System.out.println(fruits);
		System.out.println(fruits.contains("grapes"));
		fruits.remove("mango");
		fruits.remove("grapes");
		
		System.out.println(fruits);
		fruits.forEach((a)->{
			System.out.println(a);
		});
	}

}