package com.vin;

public class GCD {

	public static int findGCD(int n,int n2) {
		
		if(n>n2) {
			n=n*n2;
			n2=n/n2;
			n=n/n2;
		}
		int gcd=0;
	
		for(int i=1;i<n2;i++) {
			if(n%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public static void main(String args[]) {
		int g=findGCD(48,36);
		int h=findGCD(12,18);
		System.out.println(g);
		System.out.println(h);
		
	}
}
