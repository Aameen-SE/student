package july2026.jul14;

public class SecondLargestNum {
    public static void main(String[] args) {
        int [] arr={12,13,145,16,79};
        secondLargestNum(arr);
    }
    public static void secondLargestNum(int[] arr){

        int max = Integer.MIN_VALUE;
        int secndMax= Integer.MIN_VALUE;

        for (int a:arr){
            if(a>max){
                secndMax=max;
                max=a;
            } else if (a>secndMax && a!=max) {
                secndMax=a;
            }
        }

        System.out.println("Second Largest Number is : "+secndMax);
    }
}
