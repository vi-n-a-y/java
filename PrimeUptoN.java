public class PrimeUptoN {
    public static void main(String args[]) {
        int a = 1, b = 50, count = 0;
        System.out.print("The prime numbers from the range : ");
        for (int i = a; i < 50; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}
