class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(5, 9));
        System.out.println(obj.add(7, 8, 6));
    }
}
