public class SwapTemp {
    public static void main(String args[]) {
        int a = 5, b = 7;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);
    }
}
