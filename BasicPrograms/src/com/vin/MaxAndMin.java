package com.vin;

import java.util.Collections;

public class MaxAndMin {

	public static void main(String[] args) {
		int temp;
		int arr[]= {23,23,23};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		if(arr[0]!=arr[arr.length-1]) {
			System.out.println("Minimum value in array is :"+arr[0]);
		System.out.println("Maximum value in array is :"+arr[arr.length-1]);
		}else
			System.out.println("both the minimum and maximum values are same");
		

	}

}
