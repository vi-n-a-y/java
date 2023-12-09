import java.util.Scanner;

class Sum {  
  public static void main(String args[]) {
      Scanner num = new Scanner(System.in);
      System.out.println("enter the number : ");
      int sum = num.nextInt();
      int number = 0;
      for (int i = 0; i <= sum; i++) {
          number = number + i;
      }
      System.out.println("the sum of number is : " + number);
  }
}