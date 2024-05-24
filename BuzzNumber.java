import java.util.Scanner;

public class BuzzNumber// a number i.e, end with 7 or divisible by 7.
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        if (n % 7 == 0 || n % 10 == 7) {
            System.out.println("atheBuzz Number");
        } else {
            System.out.println("Not a Buzz Number");
        }

    }
}
