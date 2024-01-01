public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 4, 8, 2, 6, 3, 7, 9, 5 };
        int target = 5;
        int result = linearSearch(arr, target);
        if (result != -1)
            System.out.println("Element found at : " + result);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}