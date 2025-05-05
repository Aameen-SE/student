package jva.may05;
// invoking overriden method through subclass 
class Abc{
    void show(){
        System.out.println("1");
    }
}
public class OverRiddenSubClss extends Abc {
    void show(){
        super.show();
        System.out.println("2");
    }

    public static void main(String[] args) {
        OverRiddenSubClss ovr = new OverRiddenSubClss();
        ovr.show();
    }
}
