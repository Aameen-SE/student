package dsa.june01;

public class CalculateSum {
    public static void main(String[] args) {
        //Calculate sum
        int[] arr={14,52,36,74,15,25,4};
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        System.out.println("Sum of the all element in arrays : "+sum);
    }
}
