package dailypractice.july31;
//Write a program to print the first 10 Fibonacci numbers using a for loop.
public class FibonacciSeries {

    public static void main(String[] args) {


        int num = 0, num2=1;
        System.out.print("Fibonacci Series : \n"+num+" , "+num2+" , ");
        int fibo ;
        for(int i=2;i<10;i++){
            fibo= num+num2;
            System.out.print(fibo+" , ");
            num=num2;
            num2=fibo;
        }
    }
}
