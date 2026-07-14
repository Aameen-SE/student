package july2026.jul14;

public class FibonacciSeries {
    public static void main(String[] args) {

        int num=4;
        fibo(num);

    }
    public static void fibo(int num){
        int a=0,b=1;
        System.out.print("Fibonaci Series : \n"+a+", "+b);
        for (int i=1;i<num;i++){
            int c=a+b;
            System.out.print(" , "+c);
            a=b;
            b=c;
        }
    }
}
