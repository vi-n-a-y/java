package com.vin;

public class WordOccurance {

	public static void main(String[] args) {
		String str="bala tiru bala bala tiru bala bala tiru krishna rohit krishna rohit venu";
		String word[]=str.split(" ");
	for(int i=0;i<word.length;i++) {
		int count=1;
		for(int j=i+1;j<word.length;j++) {
			if(word[i].equals(word[j])) {
				count++;
				word[j]="0";
				
			}
		}
		if(word[i]!="0" ) {
			System.out.println(word[i]+": " + count);
		}
		
	}
		

	}

}
