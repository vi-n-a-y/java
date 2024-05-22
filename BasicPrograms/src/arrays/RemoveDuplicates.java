package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[]= {1,3,4,3,5,2,6,5,3};
		int n = arr.length;
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			boolean isduplicate=false;
			for(int k=0 ;k<j;k++) {
				if(arr[i]==temp[k]) {
					isduplicate=true;
					break;
				}
			}
			if(!isduplicate) {
				temp[j++]=arr[i];
			}
		}
		
		
        int[] resultArray = Arrays.copyOf(temp, j);

        // Print the result array
        System.out.println(Arrays.toString(resultArray));
		for(int i : resultArray) {
			System.out.println(i);
		}
	}

}
