public class ArrayEvenOdd {
    public static void main(String args[]) {
        int arr[] = { 2, 5, 4, 6, 7, 4, 1, 8 };
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers in array are : " + even);
        System.out.println("Odd numbers in array are : " + odd);
    }
}
