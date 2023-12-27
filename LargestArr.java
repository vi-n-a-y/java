public class LargestArr {
    public static void main(String args[]) {
        int temp, i, j;
        int arr[] = { 1, 4, 3, 5, 7, 5, 8 };
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("The largest element in the array : " + arr[n - 1]);
    }

}
