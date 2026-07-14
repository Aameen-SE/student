package july2026.jul14;

public class LargestNumInArr {
    public static void main(String[] args) {
        int [] arr={12,13,145,16,79};
        largestNum(arr);
    }
    public static void largestNum(int[] arr){
        int max =0;
        for (int a:arr){
            if(a>max)
                max=a;
        }

        System.out.println("Largest Number is : "+max);
    }
}
