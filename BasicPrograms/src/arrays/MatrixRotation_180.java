package arrays;

public class MatrixRotation_180 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int temp;
		int n = arr.length;

		System.out.println("Matrix rotation");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "	");

			}
			System.out.println();
		}

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[n - i - 1][n - 1 - j];
				arr[n - i - 1][n - 1 - j] = temp;
			}
		}

		System.out.println("After rotating the matrix 180");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "	");

			}
			System.out.println();
		}
	}
}
