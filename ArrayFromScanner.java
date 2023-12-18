import java.util.Scanner;

public class ArrayFromScanner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.print("The elements of array are : ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("The elements in the array are : ");
        for (int i : a) {
            System.out.print(i + " ");
        }

    }

}
