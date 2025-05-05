package jva.may05;

public class Test2 {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        // automatic promotion
        t2.show('a');
        t2.show(12);
        t2.show("abc");
    }
    void show(int a){
        System.out.println("int method ");
    }
    void show(String a){
        System.out.println("string method ");
    }
}
