package practice2026.oop.inheritanc;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Animal animal = new Animal();
        animal.eat();

        Animal cat = new Animal();
        cat.eat();

        Animal bear = new Dog();
        bear.eat();

        Dog dog2 = new Dog();
        dog2.eat();
    }
}
