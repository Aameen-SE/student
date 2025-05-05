package jva.may05;

public class TestMain extends Test3 {
    void show(){
        System.out.println("2");
    }
    void print(String a ,int b){
        System.out.println("String ,  int ");
    }
    public static void main(String[] args) {
        Test3 t3= new Test3();
        t3.show();
        t3.print("A",2);
        TestMain tMain = new TestMain();
        tMain.show();
    }
}
