//Creating objects for class?
class pen {
    String color;
    String type;

    public void write() {
        System.out.println(color);
        System.out.println(type);
        System.out.println("write something with pen");
    }
}

public class Object {
    public static void main(String args[]) {
        pen p = new pen();
        p.color = "red";
        p.type = "gel";

        p.write();

    }
}
