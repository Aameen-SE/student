package dailypractice.july31;

import java.util.ArrayList;
import java.util.List;

//Create a Student class with name, rollNo, and marks.
// Create and display details of 3 students using array of objects.
class Student{
    private String name;
    private int rollNo;
    private long marks;

            public Student(){}

    public Student(String name , int rollNo , long marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setMarks(long marks) {
        this.marks = marks;
    }

    public long getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return " \nName : "+name+" \nRollNo : "+rollNo+" \nMarks : "+marks+" \n=======";
    }
}
public class StudentMain {
    public static void main(String[] args) {

        Student student1= new Student();
        student1.setMarks(457);
        student1.setName("Aameen");
        student1.setRollNo(15);

        Student student2 = new Student("Asif",54,788);
        Student student3 = new Student("Rehan",74,988);

       // System.out.println(student1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for(Student st : studentList){
            System.out.println(st);
        }
    }
}
