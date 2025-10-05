package algorithm;

public class BinarySearch {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70,80,90};
        int target =65;
            int result = findTarget(arr,target);

            if(result!=-1)
                System.out.println("Target found at the index :"+result);
            else
                System.out.println("Target is not found ");

    }

    public static int findTarget(int [] arr, int target){

        int low =0;
        int high = arr.length-1;

        while (low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                low = mid+1;
            }else
                high=mid-1;

        }


        return -1;
    }
}
