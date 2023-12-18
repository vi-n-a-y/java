public class Prime {
    public static void main(String args[]) {
        int num = 7;
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }

        }
        if (count == 1) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
