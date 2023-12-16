public class ArmstrongNumberUptoN {
    public static void main(String[] args) {
        int num, r, n = 500, sum = 0;
        System.out.print("Armstrong numbers from 0 to N: ");
        for (int i = 0; i <= n; i++)

        {
            num = i;
            while (num > 0) {
                r = num % 10;
                sum = sum + (r * r * r);
                num = num / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
    }

}
