
import java.util.Scanner;

public class SubtractionMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int m = sc.nextInt();
        System.out.println("Enter the column size : ");
        int n = sc.nextInt();
        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sub[][] = new int[m][n];

        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                first[k][l] = sc.nextInt();
            }
            System.out.println("");
        }
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                second[k][l] = sc.nextInt();
            }
            System.out.println("");
        }
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                sub[k][l] = first[k][l] - second[k][l];
            }

        }

        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(sub[k][l] + " ");
            }
            System.out.println("");
        }
    }
}
