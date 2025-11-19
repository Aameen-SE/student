package dailypractice.nov.nov19;

import java.util.Objects;

class Student{
    private int rollNo;
    private String name;

    public Student(){}

    public Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "ROllNo  :"+rollNo+" Name : "+name;
    }


    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}
public class StudentMain {

    public static void main(String[] args) {

    }

}
