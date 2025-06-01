package dsa.june01;

public class CountOccurences {
    public static void main(String[] args) {
        //Count occurrences
        int[] arr={14,52,36,14,74,15,25,4,14};

        countOccur(arr,14);
    }
    public static void countOccur(int[]arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Count of occurence of element : "+target+" in arrays is :"+count);
    }
}
