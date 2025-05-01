package jva.may01;

public class MininArr {
    public static void main(String[] args) {
        // wap to find smallest  number from any array

        int[] arr = {32,45,12,67,87,90,76};
         int min = arr[0];

         for(int i =1;i<arr.length;i++){
             if(min>arr[i]){
                 min=arr[i];
             }
         }
        System.out.println("Smallest number in the array : "+min);
    }
}
