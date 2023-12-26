public class SelectionSort {
    public static void main(String args[]) {
        int a[] = { 4, 56, 7, 23, 87, 86, 34, 92, 14 };
        int i, j, smaller, temp;
        for (i = 0; i < a.length; i++) {
            smaller = i;
            for (j = i + 1; j < a.length; j++) {
                if (a[smaller] > a[j]) {
                    smaller = j;
                }
            }
            temp = a[smaller];
            a[smaller] = a[i];
            a[i] = temp;
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
