package com.vin.collections;

public class GenericsDemo<Type> {
	private Type student;
	
	public void setStudent(Type student) {
		this.student=student;
	}
	public Type getStudent() {
		return student;
	}
	
	public static void main(String args[]) {
		GenericsDemo<String> genString =new GenericsDemo<>();
		genString.setStudent("vinay");
		
		GenericsDemo<Integer> genInt=new GenericsDemo<>();
		genInt.setStudent(25);
		
		GenericsDemo<Double> genDouble=new GenericsDemo<>();
		genDouble.setStudent(12.5579);
		
		GenericsDemo<Float> genFloat=new GenericsDemo<>();
		genFloat.setStudent(15.25f);
		
		System.out.println(genString.getStudent());
		System.out.println(genInt.getStudent());
		System.out.println(genDouble.getStudent());
		System.out.println(genFloat.getStudent());
		
	}

}





//public class GenericsDemo<T>{
//	public T name;
//	public T age;
//	
//	
//	public T getName() {
//		return name;
//	}
//	public void setName(T name) {
//		this.name=name;
//	}
//	
//	public T getAge() {
//		return age;
//	}
//	public void setAge(T age) {
//		this.age=age;
//	}
//	
//	public static void main(String args[]) {
//		GenericsDemo<String> gd=new GenericsDemo<>();
//		gd.setName("balu");
//		
//		GenericsDemo<Integer> gi=new GenericsDemo<>();
//		gi.setAge(23);
//		System.out.println(gd.getName());
//		System.out.println(gi.getAge());
//	}
//	
//	
//	
//}
