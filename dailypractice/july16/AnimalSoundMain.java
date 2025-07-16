package dailypractice.july16;
//Create an interface Animal with a method makeSound().
//
//Create Dog, Cat, and Cow classes implementing Animal.
//
//Create an AnimalFactory class with a method getAnimal(String type) to return the correct animal object.
//
//Test it by creating different animals and calling makeSound()
interface Animal{
    void makeSound();
}

class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cow implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Mouuu");
    }
}

class AnimalFactory{
   public  Animal getAnimal(String type){

       if(type==null){
           return null;
       }
       switch (type){
           case "Cow":
               return new Cow();

           case "Dog":
               return new Dog();

           case "Cat":
               return new Cat();

           default:
               return null;
       }
   }

}
public class AnimalSoundMain {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();
       Animal animal1 =  animalFactory.getAnimal("Dog");
       animal1.makeSound();
    }
}
