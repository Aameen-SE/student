package jva.may22;

import java.util.ArrayList;
import java.util.List;

// Problem Statement:
//Create a system to manage multiple students.
//
//✅ Requirements:
//Create a Student class with:
//
//name (String)
//
//rollNumber (int)
//
//marks (double)
//
//In the main program:
//
//Store multiple students using ArrayList<Student>.
//
//Add at least 5 students.
//
//Display all students.
//
//Find and display the student with the highest marks.
//
//Calculate the average marks of all students.
class StudentDemo{
    private String name;
    private int rollNo;
    private double marks;

    public StudentDemo(String name , int rollNo, double marks){
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

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void display(){
        System.out.println("Name : "+name+"\n RollNo : "+rollNo+" \n Marks : "+marks+"\n-----");
    }
}
public class StudentList {
    public static void main(String[] args) {
        List<StudentDemo> student = new ArrayList<>();
        student.add(new StudentDemo("Aameen",34,78.0));
        student.add(new StudentDemo("Arsalan",54,88.0));
        student.add(new StudentDemo("Amin",12,90.5));

        System.out.println("List of the student ");
        for(StudentDemo s:student){
            s.display();
        }

        // student with the highest marks
        StudentDemo topper = student.get(0);
        for(StudentDemo s:student){
            if(s.getMarks()>topper.getMarks()){
                topper=s;
            }
        }

    // calculate avg
        double total=0;
        for(StudentDemo s:student){
            total=total+s.getMarks();
        }
        double avg =total/student.size();

        // printing

        System.out.println("Topper Name  : "+topper.getName()+"\n Makrs : "+topper.getMarks());
        System.out.println("Total avg of all the students : "+avg);


    }
}
