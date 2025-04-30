package jva.april30;



public class Prog1 {
    public static void main(String[] args) {
        //Write a Java program that:
        //
        //Takes an array of integers
        //
        //Prints the max, min, and average value
        int [] arr ={12,34,54,67,1,87,97,65};
        // fiding the average :
        int  sum = 0 ;
        for(int a=0;a<arr.length;a++){
             sum = sum+arr[a];
            System.out.println(sum);
        }
        System.out.println(sum);
        int avg = sum/arr.length;
        System.out.println("Average of the integer : "+avg);



        // finding the max
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum Integer in the array :"+max);

        // finding the min
        int min =arr[0];
        for(int j =1;j<arr.length;j++){
            if(min>=arr[j]){
                min=arr[j];
            }
        }

        System.out.println("Minimum integer in the array is :"+min);
    }
}
