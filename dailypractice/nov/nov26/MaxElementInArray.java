package dailypractice.nov.nov26;

public class MaxElementInArray {

    public static void main(String[] args) {

        int[] arr ={1,24,15,16,234,17,185,90};

        int max = findMaxElement(arr);
        System.out.println(max);
    }

    public static int findMaxElement(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
