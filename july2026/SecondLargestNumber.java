package july2026;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int arr[] = {10,50,20,80,30};

       int first = Integer.MIN_VALUE;
       int second = Integer.MIN_VALUE;

       for(int num:arr){
           if(num>first) {
               second = first;
               first = num;
           } else if (num>second && num!=first) {
               second=first;
           }
       }

        System.out.println("Second Largest Number in Array is :"+second);
    }
}
