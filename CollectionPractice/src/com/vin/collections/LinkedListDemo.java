package com.vin.collections;

import java.util.LinkedList;


public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String> animals=new LinkedList<String>();
		animals.add("tiger");
		animals.add("lion");
		animals.add("lepoard");
		animals.add("elephant");
		animals.add("tiger");
		animals.addFirst("fox");
		animals.addLast("bear");
		System.out.println(animals.indexOf("tiger"));
		System.out.println(animals.lastIndexOf("tiger"));
		System.out.println(animals.contains("fox"));
		System.out.println(animals);
		animals.add(3,"deer");
	
		System.out.println(animals);
		System.out.println("get methods");
		System.out.println(animals.get(4));
		System.out.println(animals.getFirst());
		System.out.println(animals.getLast());
		
		System.out.println("advanced forEach");
		animals.forEach((ele)->
		System.out.println("elements in the ll : "+ele));
		
		System.out.println("remove methods");
		
		System.out.println(animals.remove(1));
		System.out.println(animals.remove("deer"));
		System.out.println(animals.removeFirst());
		System.out.println(animals.removeLast());
		System.out.println(animals);
	
		animals.clear();
		System.out.println(animals);
	}

}
