package objct.comparator;
//Create a Student class with fields name and marks. Write a comparator to sort students by marks descending.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Marks : "+marks;
    }
}

class MarkComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getMarks(),o1.getMarks());
    }
}
public class StudentMain {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Aameen",78.5));
        students.add(new Student("Amin",58.5));
        students.add(new Student("Arsalan",98.5));

        Collections.sort(students,new MarkComparator());

        for (Student st : students){
            System.out.println(st);
        }
    }
}
