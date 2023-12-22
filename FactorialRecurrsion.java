class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int factorial = n * fact(n - 1);
        return factorial;
    }
}

public class FactorialRecurrsion {
    public static void main(String args[]) {
        System.out.println(Factorial.fact(5));

    }

}
