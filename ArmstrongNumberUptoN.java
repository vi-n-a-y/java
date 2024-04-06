public class ArmstrongNumberUptoN {
    public static void main(String[] args) {
        int num, r, n = 500, sum = 0;
        System.out.print("Armstrong numbers from 0 to N: ");
        for (int i = 0; i <= n; i++)

        {
            //need to fix the code
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
    }

}
