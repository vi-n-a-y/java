interface Drawable {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectange");
    }
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

public class StaticInterface {

    public static void main(String args[])

    {
        Drawable d = new Rectangle();
        Drawable d1 = new Triangle();
        d.draw();
        d1.draw();
        System.out.println(Drawable.cube(3));
    }
}
