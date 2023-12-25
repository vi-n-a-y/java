public class ReverseString {
    public static void main(String args[]) {
        String str = "ABCDEF";
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("After reversing a string : " + rev);
    }
}
