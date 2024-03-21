package com.vin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String args[]) {
		List<String> list=new ArrayList<>();
		list.add("red");
		list.add("yellow");
		list.add("green");
		list.set(1,"blue");
		list.get(2);
		Boolean h=list.contains("red");
		System.out.println(h);
		System.out.println(list);
		list.forEach((a)->{
			System.out.println("the elements in the list are : "+a);
		});
		
			
		List<String> list1=new ArrayList<>(list);
		
		List<String> ele= new ArrayList<>();
		ele.add("red");
		
		ele.add("blue");
		
		list1.removeAll(ele);
//		ele.add("black");
//		list1.addAll(ele);
		System.out.println("after adding all elements the list is "+list1);
		
		
		list.remove("green");
		System.out.println(list);
		System.out.println("the hashcode of the object is "+list.hashCode());
		list.clear();
		System.out.println(list);
		
		
		List<String> cources=Arrays.asList("java","javaScript","python",".Net","react","mySQL");
		
		for(int i=0;i<cources.size();i++) {
			System.out.println(cources.get(i));
		}
		System.out.println();
		System.out.println("//in for each loop");
		
		for( String i: cources ) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("//in for each loop");
	
	
}
}




















































//List<String> list = new ArrayList<>();
//list.add("krishna");
//list.add("rohit");
//list.add("tirumala");
//list.add(null);
//list.add("krishna");
//list.add(2, "venu");
//list.set(3, "raju");
//System.out.println(list);
//list.remove(2);
//list.remove("krishna");
//if(!list.isEmpty()) {
//System.out.println(list.get(3));
//System.out.println(list);
//list.forEach((a) -> {
//	System.out.println(a);
//});
//
//}
//List<String> listItems = new ArrayList<>(list);
//List<String> listAddElements = new ArrayList<>();
//listAddElements.add("vinay");
//listAddElements.add("balu");
//listAddElements.add("bala");
//listAddElements.clear();
//listItems.addAll(listAddElements);
//
//System.out.println("adding elements through other list");
//System.out.println(listItems);
//System.out.println(listItems.size());
