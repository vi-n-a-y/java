import java.util.Scanner;

public class BasicMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
                System.out.print(count + " ");

            }
            System.out.println("");
        }

    }
}
