package javacore;
class Print{

    public  void show(){
        System.out.println("in a Show method ");
    }
}
public class AnonymousObj {
    public static void main(String[] args) {

        Print p = new Print();
        p.show();
        System.out.println("");

        // creating an anonymous object and can be use once if we try to reuse it will first create a object then it will work .
        // every time it going to create a new object

        new Print().show();
    }
}
