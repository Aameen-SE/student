package objct.comparator.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

//Create a Student class with fields name and marks.
//👉 Sort students by marks descending using lambda.

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
        return "Name :  "+name+" Marks : "+marks;
    }
}
public class StudentMain {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Aameen",75.6));
        students.add(new Student("Adil",65.6));
        students.add(new Student("Koushik",85.6));
        students.add(new Student("Rehan",55.6));

        students.sort((e1,e2)->Double.compare(e2.getMarks(),e1.getMarks()));

        for (Student st : students){
            System.out.println(st);
        }


    }
}
