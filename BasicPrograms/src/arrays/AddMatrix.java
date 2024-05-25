package arrays;

public class AddMatrix {
	public static void main(String args[]) {

		int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int mat2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int mat3[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];

			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat3[i][j] + " ");

			}
			System.out.println();

		}
	}

}
