package designpattern.singleton;

class Student {

     static Student student = new Student();
    private Student(){

    }

    public static Student getInstance(){
        return student;
    }
}
public class EarlyInstanceCreation {

    public static void main(String[] args) {

        //Student student = new Student();
        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();

    }
}
