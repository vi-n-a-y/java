package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int arr[] = { 1,2,5,3,6,7,2,4,8};
		int n = arr.length;
		// int temp[]=new int[n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			boolean isduplicate = false;
			for (int k = 0; k < j; k++) {
				if (arr[i] == arr[k]) {
					isduplicate = true;
					break;
				}
			}
			if (!isduplicate) {
				arr[j] = arr[i];
				j++;
			}
		}

		arr = Arrays.copyOf(arr, j);

		for (int i : arr) {
			System.out.println(i);
		}

//      int[] resultArray = Arrays.copyOf(temp, j);
		// Print the result array
//      System.out.println(Arrays.toString(resultArray));
//		for(int i : resultArray) {
//			System.out.println(i);
//		}
	}

}
