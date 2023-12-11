class Apple {
    public Apple() {
        super();
        
        // Defaultly taken by java no need to specify.
        System.out.println("in Apple");
    }

    public Apple(int A) {
        super();
        System.out.println("in Apple int");
    }
}

class Banana extends Apple {
    public Banana() {
        super();
        System.out.println("in Banana");
    }

    public Banana(int b) {
        this();
        // execute constructor for same class
        System.out.println("in Banana int");
    }
}

public class Super_Class {
    public static void main(String args[]) {
        Banana b = new Banana(7);
    }
}
