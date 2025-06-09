package jva;

//1. Student Management
//Student: rollNo, name, course
//
//Operations: Add student, Delete student by rollNo, Update course, View all students

import java.util.ArrayList;
import java.util.Iterator;

class Student{
   private int  rollNo;
   private String name;
   private String course;



    public Student(int rollNo, String name, String course){
       this.rollNo=rollNo;
       this.name=name;
       this.course=course;
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

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public  void dispaly(){
        System.out.println("Name : "+name);
        System.out.println("RollNo  : "+rollNo);
        System.out.println("Course : "+course);
        System.out.println("----------------------------");

    }



}

class StudentService {
     ArrayList<Student> students = new ArrayList<Student>() ;
    //Add student

    public void addStudent(int rollNo, String name, String course){
        students.add(new Student(rollNo,name,course));
        System.out.println("Student added succesfully ");
    }

    //View all students

   public void viewAllStudent(){

       for(Student st : students){
           st.dispaly();
       }
   }


    //Update course

    public void updateStudent(int rollNo, String course){
        boolean found =false;

        for(Student s:students){
            if(s.getRollNo()==rollNo){
                s.setCourse(course);
                found=true;
                System.out.println("Course Update succesfully");
                break;
            }
        }
        if(!found)
            System.out.println("Student with rollNo : "+rollNo+" is not found ");
    }


    // Delete student by rollNo

    public void deleteStudent(int rollNo){
        boolean found = false;
        Iterator<Student> studentIterator= students.iterator();
       while(studentIterator.hasNext()){
           Student s = studentIterator.next();
           if(s.getRollNo()==rollNo){
               studentIterator.remove();
               found=true;
               System.out.println("Student removed Succesfully");
               break;
           }
       }
       if(!found)
           System.out.println("Student with the rollNo : "+rollNo+"not found ");
    }
}

public class StudentManagment {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        studentService.addStudent(25,"Aameen","Java");
        studentService.addStudent(34,"Amin","Springboot");
        studentService.addStudent(54,"Rahul","Springboot");
        studentService.addStudent(56,"Rahul","React");
        studentService.updateStudent(54,"Spring");
        System.out.println("-------------------------");
        studentService.viewAllStudent();
        System.out.println("==========================");
        studentService.deleteStudent(56);
        studentService.viewAllStudent();

    }
}
