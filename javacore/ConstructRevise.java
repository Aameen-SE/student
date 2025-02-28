package javacore;

class Human{
    private int age;
    private String name;

    public Human(){
        System.out.println("Calling the default constructor");
    }
    public Human(int age , String name){
        this.age=age;
        this.name=name;
        System.out.println("Calling the parameterized constructor ");
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}

public class ConstructRevise {
    public static void main(String[] args) {
    Human h = new Human();
    Human h1 = new Human(23,"Aameen");

    }
}
