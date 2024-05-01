package com.vin;

import java.util.Scanner;

class checkStrongNumber{
	public static  int checkStrong(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
}
	
}

public class StrongNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+checkStrongNumber.checkStrong(rem);
			n/=10;
			
		}
		if(temp==sum) {
			System.out.println("strong Number : "+temp);
		}else
			System.out.println("not a Strong Number : "+temp);
		
	}

}
