package arrayy;

public class SumOfTheArray {

    public static void main(String[] args) {

        int [] arr= {12,15,16,17};

        int sum=0;

        for(int i = 0;i<arr.length;i++){
            sum =sum+arr[i];
        }

        System.out.println("Sum  of the element in arrays : "+sum);
    }
}
