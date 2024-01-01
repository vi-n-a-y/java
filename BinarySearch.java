public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 11, 13 };
        int target = 9;
        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at : " + result);
        else
            System.out.println("Element not found");
    }
    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;

            } else if (arr[mid] > target) {
                end = mid - 1;

            }
        }
        return -1;
    }

}
