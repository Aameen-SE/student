package jva.may12;
//Create a program that simulates different animals making sounds. Define a base class Animal with a method makeSound().
// Then, create at least three subclasses (Dog, Cat, and Cow) that override the makeSound()
// method to provide specific animal sounds

abstract class Animal{
    abstract void makeSound();
}
class Cow extends Animal{
    public void makeSound(){
        System.out.println("Cow says : Moo!");
    }
}
class Dog extends Cow{
    public void makeSound(){
        super.makeSound();
        System.out.println("Dog says : Woof!");
    }
}
public class Cat extends Dog {
    public void makeSound(){
        super.makeSound();
        System.out.println("Cat says :Meoow ");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }

}
