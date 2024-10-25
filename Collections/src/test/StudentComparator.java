package test;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.getStudentName().equals(s2.getStudentName())){
			if(s1.getStudentId()>s2.getStudentId()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return s1.getStudentName().compareTo(s2.getStudentName());
		}
	}
	

}
