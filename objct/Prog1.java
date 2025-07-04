package objct;

import jva.may10.User;

import java.util.Objects;

class Student{
    private  int age ;
    private String name;

    public Student(String name, int age ){
        this.name=name;
        this.age=age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Age : "+age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;

        if(obj==null) return false;

        if(getClass() != obj.getClass())return false;

        Student other = (Student) obj;
        return this.age == other.getAge() && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}
public class Prog1 {
    public static void main(String[] args) {
        String str= "Hey ";
        System.out.println(str.getClass());
        Student student1 = new Student("Aameen",25);
        Student student2 = new Student("Aameen",25);
        Student student3 = new Student("Adil",20);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        // equalmethod
        System.out.println(student1.equals(student2));


        // hash method
        System.out.println("student 1 :"+student1.hashCode());
        System.out.println("student 2 :"+student2.hashCode());
        System.out.println("student 3 :"+student3.hashCode());


    }
}
