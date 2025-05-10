package jva.may10;

public class OverloadProg {
    public static void main(String[] args) {

        int a =90, b=10,c=89;
        addNum(a,b);
        addNum(a,b,c);
    }
    public static void addNum(int a , int b){
        System.out.println(a+b);
    }
    public static void addNum(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
