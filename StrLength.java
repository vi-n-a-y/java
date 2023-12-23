
public class StrLength {
    public static void main(String args[]) {
        String str = "welcome";
        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
            System.out.print(ch);
        }
        System.out.println("");
        System.out.println("The length of String is : " + count);

    }
}
