package dailypractice.oct.oct21;
//How do you find the second largest element in an array?

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {25, 11, 7, 75, 56};

       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;

       for(int n:arr){
           if(n>max){
               secondMax=max;
               max=n;
           } else if (n>secondMax&& n!=max) {
               secondMax=n;
           }
       }
        System.out.println("The Second Max in the array is :"+secondMax);


    }
}
