package javacore.methd;

public class Problem10 {
    public static void main(String[] args) {
        //double average(int[]), find the average of array elements and return average

        int[] arr = {12,45,32,65,89};

       double result= avgOfArr(arr);
        System.out.println("Average of the given array :"+result);

    }
    public static double avgOfArr(int[]arr){
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        double avg = sum/arr.length;

        return avg;
    }
}
