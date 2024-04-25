package com.vin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee> {
	String name;
	int age;
	int id;

	public Employee(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.age - o2.age;
	}

	public Employee() {
		super();

	}

}

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		Employee e = new Employee("t", 81, 1);
		emp.add(e);
		emp.add(new Employee("v", 27, 4));
		emp.add(new Employee("v", 24, 9));
		emp.add(new Employee("v", 23, 5));
		emp.add(new Employee("v", 28, 7));

		System.out.println(emp);
		Collections.sort(emp, new Employee());
		System.out.println(emp);

	}

}
