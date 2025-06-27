package jva.arry;

import java.util.Arrays;

public class FactorialEachElement {
    public static void main(String[] args) {
        //wap to calculate the factorial of each element of an array?
        int [] arr1 = {1,2,3,4,5,6,7,8,9};


        for(int i=0;i<arr1.length;i++){
            int num =arr1[i];
            long fact =1;
            for(int j=1;j<=num;j++){
                fact=fact*j;
            }
            System.out.print(fact+" , ");
        }

    }
}
