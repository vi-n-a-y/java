import java.util.Scanner;

public class UpperOrLower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter small or capital letter in the alphabets : ");
        char ch = sc.next().charAt(0);
        {
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("upper case letter");
            }
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("lower case letter");
            } else {
                System.out.println("Enter the correct string");
            }
        }

    }
}