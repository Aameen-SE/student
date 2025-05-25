package jva.may25;
class Person{
    String  name;
    int age;

    public Person(){
    }

    public Person(String name){
        this.name=name;

    }
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();

    }
}
