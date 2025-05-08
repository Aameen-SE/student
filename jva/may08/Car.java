package jva.may08;
// inheritance
class Vehicle {
   void show(){
       System.out.println("show 1");
   }
}

 class Scooty extends Vehicle{
    void scootyShow(){
        System.out.println("Scooty show ...");
    }
}

public class Car extends Scooty {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.show();
        cr.scootyShow();


    }
}
