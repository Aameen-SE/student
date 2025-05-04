package jva.may04;
// multilevel inheritance
public class Dog extends  Wolf{

    public static void main(String[] args) {
        //child class
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}
