package com.vin;

public class FabinocciSeries {
public static int fab(int n) {
	if(n==1) {
		return 1;
	}if(n==0) {
		return 0;
	}
	int fab1=fab(n-1);
	int fab2=fab(n-2);
	return fab1+fab2;
}
	public static void main(String[] args) {
		System.out.println("Using recurssion : "+fab(7));
		
		//using for loop to fabinocci Series
		int n=0,n2=1,sum;
		for(int i=2;i<=7;i++) {
			sum=n+n2;
			System.out.println(sum);
			n=n2;
			n2=sum;
		}

	}

}
