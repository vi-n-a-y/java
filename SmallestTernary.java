import java.util.Scanner;

public class SmallestTernary {

    public static void main(String[] args) {
        int a, b, c, small, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        a = sc.nextInt();
        System.out.println("Enter The Second Number:");
        b = sc.nextInt();
        System.out.println("Enter The Third Number:");
        c = sc.nextInt();
        temp = a < b ? a : b;
        small = c < temp ? c : temp;
        System.out.println("The Smallest Number is:" + small);
    }
}
