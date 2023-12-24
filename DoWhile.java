import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n % 7 == 0)
                break;

        } while (true);
        System.out.println("you enter multiple by 7");
        System.out.println("Thank you");

    }
}