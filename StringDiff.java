import java.util.Scanner;

class StringClass {
    public static void namaste() {
        System.out.println("namaste India");
    }

    public static void welcome() {
        System.out.println("welcome to India");
    }
}

public class StringDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character only one word : ");
        char ch = sc.next().charAt(0);
        if (ch == 'i') {
            StringClass.namaste();
        } else {
            StringClass.welcome();
        }
        System.out.println("Enjoy the day");

    }
}
