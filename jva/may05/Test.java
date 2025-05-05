package jva.may05;

public class Test {
    void show(int a){
        System.out.println("Show 1");
    }
    void show(){
        System.out.println("Show 2");
    }
    public static void main(String[] args) {
        Test t= new Test();
        t.show();
    }
}
