package dailypractice.july16;

public class SecondLargestArrayElement {

//Write a Java method to find the second largest element in an integer array.

    public static void main(String[] args) {

        int[] arr = {12,14,15,36,14,155};

        int max = arr[0];
        int temp=-1;

        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                temp=max;
                max=arr[i];
            }
        }
        System.out.println("Second largest element in array : "+temp);
    }
}
