package jva.may07;

public class MethOverloadProg1 {
    public static void main(String[] args) {
        int n1=10,n2=98,n3=11;
        addNum(n1,n2);
        addNum(n1,n2,n3);
    }
    public static void addNum(int a, int b){
        System.out.println(a+b);
    }
    public static void addNum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
