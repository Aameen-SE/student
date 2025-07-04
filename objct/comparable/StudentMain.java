package objct.comparable;
// Create a Student class with fields name and rollNumber.
// Implement Comparable to sort students by roll number in ascending order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name ;
    private  int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo-o.rollNo;
    }

    @Override
    public String toString() {
        return "Roll No : "+rollNo+"\nName : "+name+"\n------";
    }
}
public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Aameen",15));
        students.add(new Student("Amin",18));
        students.add(new Student("Arsalan",10));
        students.add(new Student("Guddu",11));

        Collections.sort(students); // compareto called

        for(Student st : students){
            System.out.println(st);
        }

    }
}
