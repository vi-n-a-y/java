import java.util.Scanner;

public class PyramidPattern {
    public static void main(String args[])

    {
        int i, j, row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row value :");
        row = sc.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(" " + j);
            System.out.print("\n");
        }
    }
}
