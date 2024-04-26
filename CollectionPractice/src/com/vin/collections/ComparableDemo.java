package com.vin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int age;
	String address;

	public Student(String name, int age, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return "Student[name :" + name + ", age : " + age + ", address : " + address + "]";
	}

	@Override
	public int compareTo(Student o) {

		return this.age - o.age;
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		st.add(new Student("b", 23, "jammu"));
		st.add(new Student("d", 22, "kashmir"));
		st.add(new Student("e", 24, "himalaya"));
		st.add(new Student("a", 27, "kolkata"));
		st.add(new Student("i", 21, "pune"));
		System.out.println(st);
		Collections.sort(st);
		System.out.println(st);

		for (Student stu : st) {
			System.out.println(stu);
		}

	}

}
