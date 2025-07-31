package dailypractice.july31;
//	Write a program to find the largest element in an integer array.
public class LargestElementInArray {

    public static void main(String[] args) {

        int[] arr = {12,15,1610,81,41,919,452,};
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Element in array : "+max);

    }
}
