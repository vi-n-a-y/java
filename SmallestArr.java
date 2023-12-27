public class SmallestArr {
    public static void main(String args[]) {
        int temp, i, j;
        int arr[] = { 1, 4, 3, 5, 7, 5, 8 };
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1; j++) {
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
        System.out.println("");
        System.out.println("The smallest element in the array : " + arr[0]);
    }

}
