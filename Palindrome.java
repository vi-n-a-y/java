public class Palindrome {
    // if we reverse a number same number appears.
    public static void main(String args[]) {
        int rev = 0;
        int a = 1221;
        int temp = a;
        while (a > 0) {
            int res = a % 10;
            rev = rev * 10 + res;
            a = a / 10;
        }
        if (rev == temp)
            System.out.println("palindrome number " + rev);
        else
            System.out.println("not a palindrome number");
    }
}
