public class ArmstrongNumber {
    public static void main(String args[]) {
        int n = 371;
        int rem, num = 0;
        int temp = n;
        while (n > 0) {
            rem = n % 10;
            num = num + (rem * rem * rem);
            n = n / 10;
        }
        if (num == temp) {
            System.out.println(num + " is  a Armstrong Number ");
        } else
            System.out.println("The Number is not a Armstrong Number!");
    }
}
