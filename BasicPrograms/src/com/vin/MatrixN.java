package com.vin;

public class MatrixN {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}}; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Rotating matrix into clock wise direction");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}

	}

}
