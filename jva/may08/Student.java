package jva.may08;
// encapsulation
public class Student {
    private int rollNo;
    private String name;

    Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
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


}
