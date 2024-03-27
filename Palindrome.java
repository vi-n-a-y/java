public class Palindrome {
    // if we reverse a number same number appears.
  public static void main(String[] args) {
		int num=11211;
		int rev=0,rem=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("the number is palindrom number");
		}else {
			System.out.println("not a palindrom number");
		}

	}
}
