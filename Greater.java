
import java.util.Scanner;

public class Greater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int a = sc.nextInt();
        System.out.println("enter the second number : ");
        int b = sc.nextInt();
        System.out.println("enter the third number : ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is greater than other two numbers");
        } else if (b > a && b > c) {
            System.out.println(b + " is greater than other two numbers");
        }

        else
            System.out.println(c + " is greater then other two numbers");
    }
}
