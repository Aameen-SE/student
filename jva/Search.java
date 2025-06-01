package jva;

public class Search {
    public static void main(String[] args) {
        int[] arr ={1,2,14,13,56,74};
        int target=3;

        int result = linearSearch(arr, target);
        int binResult= BinarySearch(arr,target);
        if(result!=-1)
            System.out.println("Target is at index: "+result);
        else
            System.out.println("Target is not in the array ");

        if(binResult!=-1)
            System.out.println("Target is at index by binarySearch: "+binResult);
        else
            System.out.println("Target is not in the array ");
    }
    public static int linearSearch(int[]arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static int BinarySearch(int[]arr,int target){

        int left =0;
        int right =arr.length-1;

        while(left<=right){
            int mid =(left+right)/2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                left=mid+1;
            }else
                right=mid-1;
        }
        return -1;
    }
}


