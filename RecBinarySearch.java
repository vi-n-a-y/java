public class RecBinarySearch {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 11, 13 };
        int target = 11;

        int result = binarySearch(arr, target, 0, arr.length);
        if (result != -1)
            System.out.println("Element found at : " + result);
        else
            System.out.println("Element not found");
    }

    public static int binarySearch(int arr[], int target, int start, int end) {
        int mid = (start + end) / 2;
        if (start <= end) {
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                return binarySearch(arr, target, mid + 1, end);
            else if (arr[mid] > target)
                return binarySearch(arr, target, start, mid - 1);
        }

        return -1;
    }

}
