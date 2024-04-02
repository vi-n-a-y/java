package com.vin;
public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {3,4,5,7};
		int sum=0,sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		for(int i=3;i<=7;i++) {
			sum2=sum2+i;
			
		}
System.out.println(sum2);
System.out.println(sum2-sum);
	}

}

