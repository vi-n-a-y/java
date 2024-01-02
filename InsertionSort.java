public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 9, 6, 4, 7, 1 };
        int i, j, key;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while ((j >= 0) && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = key;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
