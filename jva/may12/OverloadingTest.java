package jva.may12;
// overloading

public class OverloadingTest {
    public static void main(String[] args) {
        // same class , same name of method but different arguments
        int a=10, b=90,c=89;
        addNum(a,b);
        addNum(a,b,c);
    }
    public static void addNum(int a, int b){
        System.out.println(a+b);
    }
    public static void addNum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
