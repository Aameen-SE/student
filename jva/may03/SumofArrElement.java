package jva.may03;

public class SumofArrElement {
    public static void main(String[] args) {
        int[] arr = {12,34,56,65,78,87,56};

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of the element in the array "+sum);
    }
}
