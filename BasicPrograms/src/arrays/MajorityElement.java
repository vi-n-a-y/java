package com.vin;

public class MajorityElement {
	public static int findMajority(int arr[]) {
		//brute-force approch
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}

				if (count > n / 2) {

					return arr[i];
				}
			}
		}

		return -1;
	}

	// optimal approach

	public static int findMajority1(int arr[]) {
		// moore's Voting algorithm
		int n = arr.length;
		int count = 0;
		int ele = 0;
		for (int i = 0; i < n; i++) {
			if (count == 0) {
				count++;
				ele = arr[i];
			} else if (arr[i] == ele) {
				count++;
			} else {
				count--;
			}
		}
		int count1 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == ele) {
				count1++;
			}
			if (count1 > n / 2) {
				return ele;
			}
		}

		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 1, 2, 1, 1, 3, 2, 2, 2, 3, 2, 2 };
//		System.out.println(findMajority(arr));
		System.out.println(findMajority1(arr));
	}

}
