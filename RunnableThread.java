class A implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("version");
        }

    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("java");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        A a = new A();
        Thread th = new Thread(a);
        th.start();
        B b = new B();
        b.start();

    }
}
