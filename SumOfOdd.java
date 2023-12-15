public class SumOfOdd {
    public static void main(String args[]) {
        int n = 100;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;

            }

        }
        System.out.print("The sum of Odd numbers  from 0 to " + n + " is : " + sum);
    }

}
