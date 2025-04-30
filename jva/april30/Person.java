package jva.april30;

public class Person {
    //Create a Person class with:
    //
    //Private fields: name, age
    //
    //Constructor and getters/setters
    //
    //A method isAdult() that returns true if age >= 18
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void isAdult(){
        if(getAge()>=18)
            System.out.println("is Adult :"+true);
        else
            System.out.println("is Adult :"+false);
    }
}
