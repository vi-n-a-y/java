class Student {
    String name;
    int age;

    Student() {
        name = "vinay";
        age = 23;
        System.out.println("Constructor is called");

    }

    Student(String str, int a) {
        name = str;
        age = a;
    }

}

public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("balu", 24);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
