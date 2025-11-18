package dailypractice.nov.nov18;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num = sc.nextInt();
        fact(num);
        int result = recurFact(num);
        System.out.println("Result of recursionFact Method : "+result);
    }
    public static void fact(int num){
        int fact=1;
        for(;num>0;num--){
            fact=fact*num;
        }
        System.out.println("Factorial of the given num : "+fact);
    }

    public static int recurFact(int num){
        if(num>0){
            return num* recurFact(num-1);
        }
        return 1;
    }
}
