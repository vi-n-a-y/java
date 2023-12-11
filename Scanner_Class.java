import java.util.Scanner;

public class Scanner_Class {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the int value : ");
        int a = sc.nextInt();
        System.out.println("enter the double value : ");
        double d = sc.nextDouble();
        System.out.println("enter the float value : ");
        float f = sc.nextFloat();
        System.out.println("enter the String : ");
        String str = sc.next();
        System.out.println("inputs are taken from console");
    }
}
