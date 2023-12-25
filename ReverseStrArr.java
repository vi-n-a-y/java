public class ReverseStrArr {
    public static void main(String args[]) {
        String str = "abcdef";
        String rev = "";
        char a[] = str.toCharArray();
        int n = a.length;
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + a[i];

        }
        System.out.println("The reverse of a string :" + rev);
    }
}
