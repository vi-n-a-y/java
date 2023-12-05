class pen {
    String color;
    String type;

    public void print() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class This {
    public static void main(String args[]) {
        pen p1 = new pen();
        p1.color = "blue";
        p1.type = "ballpoint";

        pen p2 = new pen();
        p2.color = "black";
        p2.type = "gel";
        p1.print();
        p2.print();

    }
}