package dailypractice.nov.nov18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintPrimeNumberFromRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range you want till where prime number should be checked ?");
        int num = sc.nextInt();

        primeRange(num);
    }
    public static void primeRange(int num){
       List<Integer> primeList = new ArrayList<>();

       for(int i=2;i<=num;i++){

           boolean isPrime = true;

           for(int j=2;j*j<=i;j++){
               if(i%j==0){
                   isPrime=false;
                   break;
               }
           }

           if (isPrime)
               primeList.add(i);
       }
        System.out.println(primeList);

    }


}
