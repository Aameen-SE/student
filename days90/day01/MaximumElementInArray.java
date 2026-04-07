package days90.day01;

public class MaximumElementInArray {
    public static void main(String[] args) {

        int[] arr ={12,13,14,111,156,117,90};

        maximumELement(arr);
    }
    public static void maximumELement(int[] arr){

        int max= Integer.MIN_VALUE;

        for (int n:arr){
            if(max<n){
                max=n;
            }
        }
        System.out.println("Maximum element in the array is : "+max);
    }
}
