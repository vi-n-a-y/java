public class ExceptionExe {
    public static void main(String args[]) {

        try {
            int a = 10, b = 0;
            int c = a / b;
        } catch (ArithmeticException ae) {
            System.out.println("divide by zero error");
        }
        System.out.println("Rest of the code");
    }

}
