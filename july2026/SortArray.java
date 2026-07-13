package july2026;


import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int arr[] = {5,2,8,1,3};

        sort(arr);
    }

    public static void sort(int[] arr){

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorting Array : "+ Arrays.toString(arr));

    }
}
