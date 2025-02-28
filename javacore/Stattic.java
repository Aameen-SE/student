package javacore;
class Mobile{
    String color ;
    int prize ;
    static  String name;

    public void show(){
        System.out.println(color +" : " +prize +" : "+name );
    }
}
public class Stattic {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.color="blue";
        obj1.prize=70000;
        obj1.name="Apple";

        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.name="Samsung";
        obj2.prize=80000;
        obj2.color="black";

        obj2.show();

        // now we are making the name variable a static so after changing in one object
        obj1.name="Phone";
        // after making the variable the static one changes in static variable of an object it shows on the all the object
        obj1.show();
        obj2.show();

    }
}
