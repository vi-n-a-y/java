import java.util.Scanner;
class Lcm {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int a=sc.nextInt();
    System.out.println("Enter the second number : ");
    int b=sc.nextInt();
    int max=(a>b)?a:b;
    for(int i=max;i<=a*b;i++){
        if(i%a==0 && i%b==0){
           System.out.println(i);
            break;
           } 
       }     
    }
}
