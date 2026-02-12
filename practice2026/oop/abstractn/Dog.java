package practice2026.oop.abstractn;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sleeping();
    }
}

