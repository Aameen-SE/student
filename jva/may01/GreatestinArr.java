package jva.may01;

public class GreatestinArr {
    public static void main(String[] args) {
        //wap to find greatest number from any array
        int[] arr = {12,32,45,67,87,90,76};

        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Greatest number in the array is : "+max);
    }
}
