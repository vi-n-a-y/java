import java.util.Scanner;

public class SumMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int m = sc.nextInt();
        System.out.println("Enter the column size : ");
        int n = sc.nextInt();
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                first[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                second[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
