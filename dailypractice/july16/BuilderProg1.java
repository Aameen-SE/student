package dailypractice.july16;
import java.util.*;
//Create a Student class using Builder Pattern.
//
//Requirements
//Student has fields: name, age, university.
//
//The Builder should allow setting each field step by step.
//
//In main, build a student with name "John", age 22, university "MIT", and print all details.

class Student{
   private String name,  university;
   private int age;

   private Student(Builder builder){
       this.name= builder.name;
       this.age=builder.age;
       this.university=builder.university;
   }

   public static class Builder{
       private String name,  university;
       private int age;

       public Builder setName(String name) {
           this.name = name;
           return this ;
       }

       public Builder setAge(int age) {
           this.age = age;
           return this;
       }

       public Builder setUniversity(String university) {
           this.university = university;
           return this;
       }

       public Student build(){
           return new Student(this);
       }
   }

   public void printDetails(){
       System.out.println("Name : "+name+" Age : "+age+" University : "+university);
   }
}
public class BuilderProg1 {

    public static void main(String[] args) {

        Student student1 = new Student.Builder().setName("Aameen").setAge(25).setUniversity("GKCEM").build();

        student1.printDetails();
    }
}
