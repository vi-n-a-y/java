public class NestedTry {
    public static void main(String args[]) {
        try {

            try {
                int a[] = { 4, 5, 3, 7 };
                System.out.println(a[4]);

            } catch (IndexOutOfBoundsException ie) {
                System.out.println(ie);
            }
            System.out.println(5 / 0);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("exception in handled");
        }
    }
}
