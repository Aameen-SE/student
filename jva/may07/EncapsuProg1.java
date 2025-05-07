package jva.may07;
class Student{
    private int rollNo;
    private String name;

    public Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;

    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No : "+getRollNo()+" Name : "+getName();
    }
}
public class EncapsuProg1 {
    public static void main(String[] args) {
        Student st = new Student(12,"Aameen");
        System.out.println(st.toString());
    }
}
