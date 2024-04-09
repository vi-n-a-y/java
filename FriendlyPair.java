package com.vin;

public class FriendlyPair {
	public static int friendPair(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		int num1=6;
		int num2=28;
		int sum1=friendPair(num1);
		int sum2=friendPair(num2);
		if(sum1/num1==sum2/num2) {
			System.out.println("Friendly Pair Numbers");
		}else {
			System.out.println("Not a Friendly Numbers");
		}
		
		

	}

}
