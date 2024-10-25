package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
import java.util.*;
 
import java.util.*;
 
class Student {
    private String name;
 
    Student(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
   }
 
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
 
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Mohan");
        Student s2 = new Student("Mohan");
 
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
 
        Map<Student, String> hm = new HashMap<>();
        hm.put(s1, "a");
        hm.put(s2, "b");
 
        System.out.println("hm.size(): " + hm.size()); // 1
 
        Set<Student> s = new TreeSet<>(Comparator.comparing(Student::getName));
        s.add(s1);
        s.add(s2);
 
        System.out.println("s.size(): " + s.size()); // 1
    }
}
