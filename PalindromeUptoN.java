public class PalindromeUptoN {
    public static void main(String args[]) {
        int n, rem;
        int rev = 0;
        int limit = 300;
        for (int i = 1; i <= limit; i++) {
            n = i;
            while (n > 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            if (rev == i) {
                System.out.print(i + " ");
            }
            rev = 0;
        }

    }
}
