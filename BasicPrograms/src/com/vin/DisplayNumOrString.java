package com.vin;

import java.util.Scanner;

public class DisplayNumOrString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		Integer n = Integer.parseInt(null, sc.nextInt());
		try {

			if (n % 2 == 0) {
				System.out.println("even number");

			} else
				System.out.println("odd number");

		} catch (Exception ie) {

			System.out.println(n);
		}

	}

}
