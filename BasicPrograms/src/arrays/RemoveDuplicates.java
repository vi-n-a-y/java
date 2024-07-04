package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[] = { 1,2,5,3,6,7,2,4,8};
		int n = arr.length;
		// int temp[]=new int[n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			boolean isduplicate = false;
			for (int k = 0; k < j; k++) {
				if (arr[i] == arr[k]) {
					isduplicate = true;
					break;
				}
			}
			if (!isduplicate) {
				arr[j] = arr[i];
				j++;
			}
		}

		arr = Arrays.copyOf(arr, j);

		for (int i : arr) {
			System.out.println(i);
		}

//      int[] resultArray = Arrays.copyOf(temp, j);
		// Print the result array
//      System.out.println(Arrays.toString(resultArray));
//		for(int i : resultArray) {
//			System.out.println(i);
//		}
	}

}



// package com.vin;

// import java.util.Arrays;

// class Solution {
// 	public void merge(int arr1[],int m,int arr2[],int n) {
// 		int left=m-1;
// 		int right=0;
// 		while(left>=0 && right<n) {
// 			if(arr1[left]>=arr2[right]) {
// 				int temp=arr1[left];
// 				arr1[left]=arr2[right];
// 				arr2[right]=temp;
// 				left--;
// 				right++;
// 			}else {
// 				break;
// 			}
// 		}
// 		for(int i=0;i<arr1.length;i++) {
// 			for(int j=i+1;j<arr1.length;j++) {
// 				if(arr1[i]>arr1[j]) {
// 					int temp=arr1[i];
// 					arr1[i]=arr1[j];
// 					arr1[j]=temp;
// 				}
// 			}
			
// 		}
		
// 		for(int i:arr1) {
// 			System.out.print(i);
// 		}
// 		System.out.println();
		
// 		for(int i=0;i<arr2.length;i++) {
// 			for(int j=i+1;j<arr2.length;j++) {
// 				if(arr2[i]>arr2[j]) {
// 					int temp=arr2[i];
// 					arr2[i]=arr2[j];
// 					arr2[j]=temp;
// 				}
// 			}
			
// 		}
		
// 		for(int i:arr2) {
// 			System.out.print(i);
// 		}
// 		Arrays.copyOf(arr1, m+n);
// 		for(int i=m;i<m+n;i++) {
// 			arr1[i]=arr2[i-m];
// 		}
// 		System.out.println();
// 		for(int i:arr1) {
// 			System.out.print(i);
// 		}
		
// 	}

// }public class MergeTwoSortedArray{
// 	public static void main(String args[] ){
// 		int arr1[]= {2,5,6,8,9};
// 		int arr2[]= {3,5,7,9};
// 		Solution s=new Solution();
// 		s.merge(arr1, arr1.length, arr2, arr2.length);
// 	}
// }

