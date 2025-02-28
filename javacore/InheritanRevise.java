package javacore;
class A{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int ");
    }
}

class B extends A{
    public B(){
        super(65);
        //super();
        System.out.println("in B ");
    }

    public B(int n){
        this();
      //  super(n);
        System.out.println("in B int ");
    }
}
public class InheritanRevise {
    public static void main(String[] args) {
        B b = new B(67);

    }
}
