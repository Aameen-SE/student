package practice2026.oop.abstractn;

public abstract class Person {

    String name;

    public Person(String name){
        this.name=name;
    }

    abstract void getRole();
}
