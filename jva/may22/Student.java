package jva.may22;
//Create a class named Student with the following attributes:
//
//name (String)
//
//rollNumber (int)
//
//marks (double)
//Create a constructor to initialize the student.
//
//Add a method displayDetails() to print student details.

class StudentCore{
    private String name;
    private int rollNumber;
    private double marks;

    public StudentCore(String name , int rollNumber , double marks){
        this.marks=marks;
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public void displayDetails(){
        System.out.println("\n Name : "+name+" \nRollNo :"+rollNumber+"\n Marks : "+marks);
    }

}
public class Student {
    public static void main(String[] args) {
        StudentCore student = new StudentCore("Aameen",34,43.6);
        student.displayDetails();
    }
}
