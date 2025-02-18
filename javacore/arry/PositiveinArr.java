package javacore.arry;

import java.util.Arrays;

public class PositiveinArr {
    public static void main(String[] args) {
        //wap to print only positive number from an array
        int[] arr = {-1,42,-98,76,-54,60};

        System.out.println(Arrays.toString(arr));

        // using for enhanced loop
        System.out.println("Printing the positive in the array using for enhanced loop  : ");
        for(int a:arr){
            if(a>0){
                System.out.print(a+" , ");
            }
        }

        System.out.println("\nPrinting using for loop ");
        printPos(arr);
        }
                  // using for loop
                public static void printPos(int[] a) {
                    for(int i =0;i<a.length;i++){
                        if(a[i]>0){
                            System.out.print(a[i]+" , ");
                        }
                    }
                }



    }



