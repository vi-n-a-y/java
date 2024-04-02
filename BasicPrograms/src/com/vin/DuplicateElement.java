package com.vin;

import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
		String arr[]= {"java","C","C plus","python","java","python"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element found "+arr[i]);
				}
			}
		}
		HashSet<String> set=new HashSet<>();
		set.add("java");
		set.add("C");
		set.add("C plus");
		set.add("python");
		set.add("java");
		set.add("python");
		System.out.println(set);
		

	}

}
