package javacore.methd;

public class Fibonacii {
    public static void main(String[] args) {
        //Wap to print Fibonacci series up to n terms.
        int n=10;
        int n1=0,n2=1;

        System.out.println(" Fibonacci series up to n terms. where n = "+n+"\n "+n1+" , "+n2);
        printFibo(n,n1,n2);

    }
    public static void printFibo(int n,int n1,int n2){
        for(int i=1;i<=n;i++){
            int fibo = n1+n2;
            System.out.print(fibo+" , ");
            n1=n2;
            n2=fibo;
        }
    }
}
