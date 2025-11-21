package dailypractice.nov.nov21;

//Write a program to demonstrate super keyword
//
//(using both: calling parent constructor + accessing parent variable).**
class Parent{

    String msg ="Hello from parents";
    public Parent(){
        System.out.println("Parents Constructor");
    }

}

class Child extends Parent{

    public Child(){
        super();
        System.out.println(super.msg);
        System.out.println("Child Constructor");
    }
}
public class DemonstrateSuperProg {
    public static void main(String[] args) {
        Child child1 = new Child();
    }
}
