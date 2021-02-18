package com.introductiontocollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int id;
    double marks,age;
    String name;
    Student(int id, double marks, double age, String name){
        this.id = id;
        this.marks = marks;
        this.age = age;
        this.name = name;
    }
    public double getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Student : " + id + " - " + marks + " - " + age + " - " + name + "\n";
    }
}
public class ques5 {
    public static void main(String[] args) {
        Student s1 = new Student(1,88,23,"ankit");
        Student s3 = new Student(4,88,19,"rishabh");
        Student s2 = new Student(2,83.5,20,"abhishek");
        Student s4 = new Student(6,56.5,21,"piyush");

        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        Collections.sort(students, Comparator.comparing(Student::getMarks)
                .thenComparing(Student::getName));
        System.out.println(students);
        System.out.println("highest marks is: " + students.get(students.size()-1).marks);
    }
}
