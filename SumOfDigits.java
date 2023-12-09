import java.util.Scanner;

public class SumOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            res = res + rem;
            num = num / 10;
        }
        System.out.println("the sum of digits is : " + res);
    }
}