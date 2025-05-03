package jva.may03;

public class Fibonacci {
    public static void main(String[] args) {
        int num=5;
        int n1=0,n2=1;
        System.out.println("Fibonacci Series : ");
        System.out.print(n1+" , "+n2);

        for(int i =3;i<=num;i++){
            int fibo = n1+n2;
            System.out.print(" , "+fibo);
            n1=n2;
            n2=fibo;
        }
    }
}
