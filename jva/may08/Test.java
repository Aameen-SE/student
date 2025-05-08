package jva.may08;
// method overloading
public class Test {
    public static void main(String[] args) {
        int n1=12,n2=90,n3=10;
        addNum(n1,n2);
        addNum(n1,n2,n3);
    }
    public static void addNum(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }
    public static void addNum(int n1,  int n2){
        System.out.println(n1+n2);
    }
}
