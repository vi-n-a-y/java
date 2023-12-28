import java.util.Scanner;

public class Vowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        // char ch=str.charAt(0);
        int v = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'u') {
                v++;
            }
        }
        if (v > 0) {
            System.out.println("the given input consist vowel(s) : " + str);
        } else {
            System.out.println("not a vowel");
        }
    }

}
