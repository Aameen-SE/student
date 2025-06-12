package jva.arry;

public class SumOfInput {
    public static void main(String[] args) {
        //Input 5 numbers, store them in an array, and print the sum.

        int[] arr ={1,2,3,45,6};
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        System.out.println("Sum of the array : "+sum);
    }
}
