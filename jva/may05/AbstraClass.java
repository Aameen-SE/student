package jva.may05;
abstract class AbsTest{
    void display(){}
    void show(){
        System.out.println("1");
    }
}
public class AbstraClass extends AbsTest{
    void display(){

    }
   void show(){
       System.out.println("2");
   }

    public static void main(String[] args) {
        AbstraClass abs = new AbstraClass();
        abs.show();
    }


}
