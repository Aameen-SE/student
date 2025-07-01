package clsss.july01;

//create a class of name Arithmetic, add methods like add, sub, div, prod, fibonacci, prime, factorial.
// Plz make these methods return type and
//		arguments according to your wish.

import java.util.Arrays;
import java.util.Scanner;

public class Arithmethic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the number : \n------------------ \n1.Add two number \n2.Subtract two number \n3.Product of two number " +
                "\n4.Divide two number \n5.Fibonacci Series : \n6.Factorial of the number \n7.Check the number is prime or not : " +
                "\n==================== \nEnter your number --------");

        int choice = sc.nextInt();
        int number1,number2;
        switch (choice){
            case 1:
                System.out.println("Enter the first number : ");
                 number1=sc.nextInt();
                System.out.println("Enter the secound number : ");
                 number2=sc.nextInt();
                int addResult = addMethod(number1,number2);
                System.out.println("Addition of two number is : "+addResult);
                break;

            case 2:
                System.out.println("Enter the first number : ");
                 number1=sc.nextInt();
                System.out.println("Enter the secound number : ");
                 number2=sc.nextInt();
                int subResult = subMethod(number1,number2);
                System.out.println("Subtraction of two number is : "+subResult);
                break;

            case 3:
                System.out.println("Enter the first number : ");
                 number1=sc.nextInt();
                System.out.println("Enter the secound number : ");
                 number2=sc.nextInt();
                int productResult = prodMethod(number1,number2);
                System.out.println("Product of two number is : "+productResult);
                break;

            case 4:
                System.out.println("Enter the first number : ");
                number1=sc.nextInt();
                System.out.println("Enter the secound number : ");
                number2=sc.nextInt();
                int divResult = divMethod(number1,number2);
                System.out.println("Remainder of two number is : "+divResult);
                break;

            case 5:
                System.out.println("Enter the number of fibonacci series you want : ");
                int fiboNum = sc.nextInt();
                int[] fiboResult = fibo(fiboNum);
                System.out.println("Fibonacci Series : "+Arrays.toString(fiboResult));
                break;

            case 6:
                System.out.println("Enter the number to find its factorial : ");
                int factNum= sc.nextInt();
                int factResult = printFactorial(factNum);
                System.out.println("Factorial of the given number : "+factResult);
                break;

            case 7:
                System.out.println("Enter the number to check its prime or not : ");
                int primeNum =sc.nextInt();
                boolean check = checkPrimeNumber(primeNum);

                if(check)
                    System.out.println("Prime number ");
                else
                    System.out.println("Not a prime number ");

                break;

        }
        sc.close();

    }
    public static int addMethod(int n1 , int n2){
        int result = n1+n2;
        return result;
    }
    public static int subMethod(int n1 , int n2){
        int result=0;
        if(n1>n2){
            result=n1-n2;
        }else {
            result =n2-n1;
        }
        return result;
    }
    public static int prodMethod(int n1 , int n2){
        int result = n1*n2;
        return result;
    }
    public static int divMethod(int n1 , int n2){
      int result = 0;
       if(n1>n2){
           result=n1/n2;
       }else {
           result=n2/n1;
       }
        return result;
    }

   // fibonacci series
    public static int[] fibo(int num){
        int n1 =0, n2=1;
        int fibo;
        int result[] = new int[num];
        result[0]=n1;
        result[1]=n2;

        for (int i=2;i<num;i++){
            fibo= n1+n2;
            result[i]=fibo;
             n1=n2;
             n2=fibo;
        }
        return result;
    }

    // factorial
    public static int printFactorial(int num){
        int fact =1;
        for(int i= num;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }

    // prime number
    public static boolean checkPrimeNumber(int num){

        if(num<=1){
            return false;
        }
        else {
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%1==0){
                    return false;
                }
            }
        }
        return true;
    }
}
