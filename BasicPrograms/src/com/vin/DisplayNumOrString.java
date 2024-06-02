package com.vin;

import java.util.Scanner;

public class DisplayNumOrString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		String str = sc.nextLine();

		try {
			if (Integer.parseInt(str) % 2 == 0) {
				System.out.println("even number");
			} else {
				System.out.println("odd number");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("name is : " + str);
			nfe.printStackTrace();
//			nfe.getMessage();
		}

	}

}
