package javacore.arry;

import java.util.Arrays;

public class GreatestNuminArr {
    public static void main(String[] args) {
        //wap to find greatest number from any array

        int[] arr = {12,34,56,76,89,90,76,54,31,13,43};
        System.out.println(Arrays.toString(arr));

        int max=arr[0];

        for(int i =1;i<arr.length-1;i++){
          boolean b=  max<arr[i];
          if(b==true){
              max=arr[i];
          }
        }
        System.out.println("Greatest number in array : "+max);

    }
}
