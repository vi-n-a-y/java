public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 8, 3, 6, 1, 5, 9, 2 };
        int i, j, temp;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
