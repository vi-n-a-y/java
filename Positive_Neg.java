import java.util.Scanner;

public class Positive_Neg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("positive number");

        } else {
            System.out.println("negative number");
        }
    }
}
