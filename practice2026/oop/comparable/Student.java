package practice2026.oop.comparable;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    String name;
    float marks;

    public Student(String name,float marks){
        this.name=name;
        this.marks=marks;
    }


    @Override
    public int compareTo(Student o) {
        return (int)(this.marks-o.marks);
    }

    public static void main(String[] args) {
        Student kunal = new Student("Kunal",78.5f);
        Student rahul = new Student("Rahul",88.5f);



        if(kunal.compareTo(rahul)>0){
            System.out.println(kunal.compareTo(rahul));
            System.out.println("Kunal has better marks than rahul");}
        else {
            System.out.println(kunal.compareTo(rahul));
            System.out.println("Rahul has better marks than kunal");
        }
    }
}
