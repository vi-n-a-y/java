package arrays;

public class MatrixRotation_90 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int n = arr.length;

		// transpose of a matrix
		int temp;
		for (int i = 0; i <= n / 2; i++) {
			for (int j = i + 1; j < n; j++) {
				temp = arr[j][i];
				arr[j][i] = arr[i][j];
				arr[i][j] = temp;

				// System.out.println(arr[i][j]);
			}
		}
//		System.out.println("The matrix After the transponse : ");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println("After rotating the matrix 90` clock-wise direction ");
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}

}

//output

//After rotating the matrix 90` clock-wise direction 
//13  9  5  1  
//14  10  6  2  
//15  11  7  3  
//16  12  8  4  

//for(int i=0;i<arr.length;i++) {
//for(int j=0;j<arr.length;j++) {
//	System.out.println("a["+i+"]["+j+"] = "+arr[i][j]);
//}
//}

//int mat[][]=new int[4][4];

//for(int i=0;i<n;i++) {
//for(int j=0;j<n;j++) {
//	mat[i][j]=arr[n-1-j][i];
//}
//}
//for(int i=0;i<mat.length;i++) {
//for(int j=0;j<mat.length;j++) {
//	System.out.println("a["+i+"]["+j+"] = "+mat[i][j]);
//}
//}
