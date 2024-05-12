public class Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 5;
        a[1] = 6;
        a[2] = 7;
        a[3] = 8;
        a[4] = 9;
        int arr[]={5,8,9,3,1,7};
        System.out.println("Array elements are : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(j);
        }
    }
}
