package corejava.sep21;

public class Dog extends AbstAnimal {
    public void bark(){
        System.out.println("bhow bhow");
    }
    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.bark();
    }
}
