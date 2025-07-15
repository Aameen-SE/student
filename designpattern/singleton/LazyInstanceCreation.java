package designpattern.singleton;
class Abc{

    static Abc obj;

    private Abc(){

    }

    static Abc getInstance(){
        if(obj==null) {
            obj = new Abc();
        }
        return obj;
    }
}
public class LazyInstanceCreation {

    public static void main(String[] args) {

        Abc obj1 = Abc.getInstance();
    }
}
