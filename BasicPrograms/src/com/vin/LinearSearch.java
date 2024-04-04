package com.vin;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9,5,4,7,8};
	int b=5;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==b) {
				System.out.println("the element found at the index of "+i);
				break;
			}
		}
	}

	}

}
