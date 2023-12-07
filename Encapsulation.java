class person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        person p1 = new person();
        p1.setName("abcde");
        p1.setAge(22);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }

}
