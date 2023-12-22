class Fibonacci {
    public static int fab(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        int sum1 = fab(n - 1);
        int sum2 = fab(n - 2);
        int sum = sum1 + sum2;
        return sum;

    }

    public static void main(String args[]) {
        System.out.println(fab(6));

    }
}
