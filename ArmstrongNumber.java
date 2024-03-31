public class AmstrongNumber {

	public static int amstrong(int num) {
		int digit = 0;
		while (num > 0) {

			num = num / 10;
			digit++;

		}

		return digit;
	}

	public static void main(String[] args) {
		int num = 153;

		int temp = num;
		int rem, rev = 0;
		int digit = amstrong(num);
		while (num > 0) {
			rem = num % 10;
			rev = (int) (rev + (Math.pow(rem, digit)));
			num /= 10;
		}

		if (rev == temp) {
			System.out.println("Given number is amstrong number");
		} else
			System.out.println("Not a amstrong number");

	}

}

