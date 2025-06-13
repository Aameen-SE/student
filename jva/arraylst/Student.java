package jva.arraylst;

import java.util.ArrayList;


//Create ArrayList of student names – add, update, delete, and display them.
public class Student {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Aameen");
        studentList.add("Khan");
        studentList.add("Arsalan");

        System.out.println(studentList);

        studentList.remove("Khan");
        System.out.println(studentList);


    }

}
