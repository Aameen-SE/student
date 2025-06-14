package jva.arraylst;

import java.util.ArrayList;


//Create ArrayList of student names – add, update, delete, and display them.
public class Student {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        // adding the student

        studentList.add("Aameen");
        studentList.add("Khan");
        studentList.add("Arsalan");

        // printing the list
        System.out.println(studentList);

        // removing a student
        studentList.remove("Khan");
        System.out.println(studentList);

        //update
        String oldName = "Arsalan";
        String newName="Arsalan Khan";
        int index = studentList.indexOf(oldName);
        if(studentList.contains(oldName)){
            studentList.set(index,newName);
            System.out.println("Student updated :");
        }else {
            System.out.println("No student with that name in student list");
        }

        System.out.println("After updation ");
        System.out.println(studentList);


    }

}
