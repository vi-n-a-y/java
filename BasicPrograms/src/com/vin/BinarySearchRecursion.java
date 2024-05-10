package com.vin;

public class BinarySearchRecursion {
	public static int usingRecursion(int arr[], int low, int high, int key) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < key) {
				return usingRecursion(arr, mid + 1, high, key);
			} else if (arr[mid] == key) {
				return mid;
			} else
				return usingRecursion(arr, low, mid - 1, key);
		}

		if (low > high) {
			return -1;
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = usingRecursion(arr, 0, arr.length - 1, 8);
		if (n >= 0) {
			System.out.println("element found at the index of : " + n);
		} else
			System.out.println("element not found !");
		
		

	}
	
	

}


