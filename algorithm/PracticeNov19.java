package algorithm;

import java.util.Arrays;

public class PracticeNov19 {

    public static void main(String[] args) {
     //   int [] arr ={5,4,3,2,1};
       // sort(arr);
        // System.out.println(Arrays.toString(arr));

//Missing Number
        int arr[] = {3,0,2,1};
        System.out.println(missingNum(arr));
    }
    //o-N
    // sort the array using cyclic

    public static void sort(int [] arr){

        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
         if(arr[i]!=arr[correct]){
             swap(arr,i,correct);
         }
         else {
             i++;
         }
        }
    }

    public static int missingNum(int [] arr){

        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

        for (int index =0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }

        return arr.length;
    }



    public static void swap(int [] arr , int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }




}
