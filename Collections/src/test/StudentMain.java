package test;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		Student s=new Student(1,"student1",99.0);
		Student s2=new Student(3, "student2", 98.0);
		Student s4 = new Student(2,"student4",75.0);
		Student s3 = new Student(4,"student3",85.0);
		Student s5 = new Student(5,"student4",75.0);
		
		List<Student> list=Arrays.asList(s,s2,s3,s4,s4);
		list.stream().sorted(new StudentComparator());
	}
}
