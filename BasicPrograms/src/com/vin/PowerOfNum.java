package com.vin;

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		System.out.println("Enter the Power want to do ");
		int p = sc.nextInt();
		int pow = 1;
		for (int i = 1; i <= p; i++) {
			pow = pow * n;

		}
		System.out.println(pow);

	}

}
