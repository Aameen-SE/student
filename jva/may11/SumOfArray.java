package jva.may11;

public class SumOfArray {
    public static void main(String[] args) {
        //sum of the array
        int[] arr ={12,34,56,78};
        int sum =0;

        for(int i =0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of the arrays : "+sum);
    }
}
