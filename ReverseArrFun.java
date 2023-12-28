public class ReverseArrFun {
    public static void reverseFun(int arr[], int n) {
        int first, second;
        for (int i = 0; i < n / 2; i++) {
            first = arr[i];
            second = arr[n - i - 1];
            arr[i] = second;
            arr[n - i - 1] = first;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        reverseFun(arr, n);
    }
}
