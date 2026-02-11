package practice2026.oop.inheritanc;

public class Person {
    String name;

    public Person(String name){
        this.name=name;
    }

    public void display(){
        System.out.println("Person Display method is called"+name);
    }

}
