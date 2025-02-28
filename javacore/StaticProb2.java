package javacore;
class Student{
    String name ;
    int rollNo;

    static{
        String section;
        System.out.println("static method is called ");
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("constructor is called");
    }
}
public class StaticProb2 {
    public static void main(String[] args) {
        // in this we learned that if we called an obj as many time as we want , static method will be called
        // once and constructor as many as object is called

        Student st=new Student("Aameen",12);
        Student st2=new Student("Aameen",12);

    }
}
