package algorithm;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,56,70};
        int target = 56;

        int result = findTarget(arr,target);
        if(result!=-1)
            System.out.println("Target is found at index is :"+result);
        else
            System.out.println("Target is not in the array ");

    }

    public static int findTarget(int[] arr, int target){

        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
