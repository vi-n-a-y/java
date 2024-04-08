import java.util.Scanner;

public class ArmstrongNumberUptoN {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int a=sc.nextInt();
		System.out.println("Enter the second Number : ");
		int b=sc.nextInt();
		int count=0;
		for(int i=a;i<=b;i++) {
			int rev=0;
			int num=i;
			while(num>0) {
				num/=10;
				count++;
			}
			num=i;
			while(num>0) {
				int rem=num%10;
				rev=(int) (rev+Math.pow(rem, count));
				num/=10;
			}
			if(i==rev) {
				System.out.println(i);
			}
			count=0;
		}
		

	}

}
