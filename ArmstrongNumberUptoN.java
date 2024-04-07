public class ArmstrongNumberUptoN {
	public static void main(String args[]) {
		int min = 1;
		int max = 160;
		int count = 0;
		int rev = 0;
		for (int i = min; i < max; i++) {
			while (i > 0) {
				i = i / 10;
				count++;

			}
			while (i > 0) {
				int rem = i % 10;
				rev = (int) (rev + (Math.pow(rem, count)));
				i = i / 10;
				if (rev == i) {
					System.out.println(rev);
				}

			}

			count = 0;
		}

	}

}
