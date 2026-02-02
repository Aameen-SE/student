package dsa.twoPointer;

public class SlidingWindow {
    public static void main(String[] args) {
        int [] arr ={3,8,2,5,7,6,12};
        int n =arr.length-1;
        int k =4;
        int c= 0;
        for(int i=0;i<k;i++){
            c = c+arr[i];
        }

        int max =c;

        for(int i=1;i<=n-k;i++){
            c= c - arr[i-1] + arr[i + k-1];

            if(c>max)
                max=c;
        }
        System.out.println(max);
    }
}
