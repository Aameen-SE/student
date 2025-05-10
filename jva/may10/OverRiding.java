package jva.may10;
// Polymorphism

class Addition {
    public static void addNum(int a, int b){
        System.out.println(a+b);
    }
}
public class OverRiding extends Addition {
    public static void main(String[] args) {
      int a=90, b=10;
        addNum(a,b);
    }
    public static void addNum(int a, int b){
        System.out.println(a+b);
    }
}
