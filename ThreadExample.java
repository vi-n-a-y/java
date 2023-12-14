class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                System.out.println("interup exception");
            }

            System.out.println("java");
        }
    }
}

class B extends A {
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("version");
            }
        }
    }
}

class ThreadExample {
    public static void main(String args[]) {
        A a = new A();
        a.start();
        B b = new B();
        try {
            Thread.sleep(1);
            b.start();

        } catch (InterruptedException e) {
            System.out.println("Exception Handled");
        }
    }
}
