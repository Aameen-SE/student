package july2026;

public class FibonacciSeries {
    public static void main(String[] args) {

        int a=0,b=1;
        int num=10;
        System.out.print("FibonacciSeries : \n"+a +" , "+b);

        for(int i=0;i<num;i++){
            int fibo=a+b;
            System.out.print(" , "+fibo);
            a=b;
            b=fibo;
        }

    }
}
