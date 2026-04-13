package days90.day03;

public class MaximumElementInArray {
    public static void main(String[] args) {
        int[] arr ={12,13,14,111,156,117,90};
        System.out.println(max(arr));

    }

    public static int max(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int a:arr){
            if(max<a){
                max=a;
            }
        }

        return max;
    }
}
