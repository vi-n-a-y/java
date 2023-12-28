public class SumOfArray {
    public static void main(String args[]) {
        int array[] = { 7, 2, 8, 4, 9, 6 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of array is : " + sum);
    }
}
