package com.vin;

public class StarReversePattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" ");
				for(int k=5;k>0;k--) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}

	}

}
