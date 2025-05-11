package jva.may11;

public class SmallElementInArray {
    public static void main(String[] args) {
        //smallest element in the array

        int []arr ={39,12,54,87,96,35,57,88};
        int min=arr[0];

        for(int i =0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("Smallest ELement in the array : "+min);
    }
}
