package jva.may14;

public class Candidate {
    private int rollNo;
    private String name;
    private String email;

    public Candidate(){}

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void display(){
        System.out.println("Name : "  +name+ " , Roll_no : "+rollNo+" , Email : "+email);
    }
}
