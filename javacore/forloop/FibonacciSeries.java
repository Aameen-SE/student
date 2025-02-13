package javacore.forloop;

public class FibonacciSeries {
    public static void main(String[] args) {
        //wap to print fibonocci series
        int num =5;
        int n1=0,n2=1;
        int fibo;

        System.out.println("Fibonacci series upto 5 is : ");
        System.out.print(n1+" , "+n2+" , ");
        for(int i=2;i<num;i++){
        fibo=n1+n2;
            System.out.print(fibo+ " , ");
        n1=n2;
        n2=fibo;
        }
    }
}
