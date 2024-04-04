package com.vin;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String arr1[]= {"java","C","C++","python","java","C","python"};
		
		int arr[]= {8,5,4,5,6,7,5,1,2,3,5,8,4,7};
		Boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				System.out.print(arr[i]+" ");
				flag=true;
				}
			}
		}
		if(flag=false) {
			System.out.println("no duplicate elements not found");
		}
		
		HashSet<String> set=new HashSet<>();
		set.add("java");
		set.add("C");
		set.add("C++");
		set.add("python");
		set.add("java");
		set.add("C");
		set.add("python");
		for(String st:set) {
//			System.out.println(st);
		}

	}

}
