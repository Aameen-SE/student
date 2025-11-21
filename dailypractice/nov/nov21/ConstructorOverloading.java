package dailypractice.nov.nov21;
//Implement a program to show constructor overloading
class Student{
    private int rllNo;
    private String name;

    //noArgs constructor
    public Student(){}

    public Student(int rllNo){
        this.rllNo=rllNo;
    }

    public Student(int rllNo,String name){
        this.rllNo=rllNo;
        this.name=name;
    }

}
public class ConstructorOverloading {
    public static void main(String[] args) {

        Student student1= new Student();
        Student student2 = new Student(123);
        Student student3 = new Student(123,"Aameen");
    }
}
