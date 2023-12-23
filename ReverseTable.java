public class ReverseTable {
    public static void main(String args[]) {
        int n = 7;
        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " *" + i + " = " + n * i);
        }
        System.out.println("Reversing a table");
        for (int i = 20; i >= 1; i--) {
            System.out.println(n + " *" + i + " = " + n * i);
        }

    }
}
