package jva.may23;
//Create an abstract class Machine with a method start(), a method stop(), and an abstract method process().
//Create a subclass WashingMachine that defines how process() works. Then call all the methods in sequence.

abstract class Machine {
   public void start(){
        System.out.println("Machine Started ... ");
    };

   public  void stop(){
        System.out.println("Machine stopped ");
    }

    abstract void process();

}

class WashingMachine extends Machine{

    @Override
    void process() {
        System.out.println("Wash clothes when the clothes and detergent powder is added : ");
    }
}

public class MachineMain {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();

        washingMachine.process();
        washingMachine.start();
        washingMachine.stop();
    }
}
