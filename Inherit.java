class Shape {
    public void area() {

    }
}

class Triangle extends Shape {
    public void area(double l, double b) {
        System.out.println((0.5 * (l + b)));
    }
}

// multi-level inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int b) {
        System.out.println(1 / 2 * (l * b));
    }
}

// hierarchical inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

// hydrid inheritance
class Square extends Shape {
    public void area(int a) {
        System.out.println(a * a * a);
    }
}

class Rectangle extends Square {
    public void area(int l, int b) {
        System.out.println(2 * (l + b));
    }

}

public class Inherit {
    public static void main(String args[]) {
        Shape s = new Shape();
        s.area();
        Triangle t1 = new Triangle();
        t1.area(5, 9);
        Triangle et = new EquilateralTriangle();
        et.area(3, 7);
        Circle c = new Circle();
        c.area(8);
        Square s2 = new Square();
        s2.area(6);
        Rectangle s3 = new Rectangle();
        s3.area(5, 9);

    }
}
