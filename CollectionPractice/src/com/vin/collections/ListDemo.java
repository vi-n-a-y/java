package com.vin.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("krishna");
		list.add("rohit");
		list.add("tirumala");
		list.add(null);
		list.add("krishna");
		list.add(2, "venu");
		list.set(3, "raju");
		System.out.println(list);
		list.remove(2);
		list.remove("krishna");
		if(!list.isEmpty()) {
		System.out.println(list.get(3));
		System.out.println(list);
		list.forEach((a) -> {
			System.out.println(a);
		});
		
}
		List<String> listItems = new ArrayList<>(list);
		List<String> listAddElements = new ArrayList<>();
		listAddElements.add("vinay");
		listAddElements.add("balu");
		listAddElements.add("bala");
	listAddElements.clear();
		listItems.addAll(listAddElements);
		
		System.out.println("adding elements through other list");
		System.out.println(listItems);
		System.out.println(listItems.size());
	}

}
