class Student {
    String name;
    int age;

    Student() {
        name = "abcd";
        age = 123;

    }

    Student(String str, int a) {
        name = str;
        age = a;
    }

}

public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("defg", 567);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
