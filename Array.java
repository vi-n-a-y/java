public class Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 5;
        a[1] = 6;
        a[2] = 7;
        a[3] = 8;
        a[4] = 9;
        System.out.println("Array elements are : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
