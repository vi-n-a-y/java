package com.vin;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 4, 2, 7, 8, 5, 3, 4 };

		int i = 0;
		int n=arr.length();
		boolean isduplicate =false;
		for (int j = 1; j < n; j++) {
			if (arr[i] != arr[j]) {
				arr[i + 1] = arr[j];
				i++;
			}
			arr[i]=arr[n-1];
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
			
		}
		System.out.println(arr.length);

	}

}
