package corejava.aug04;

public class SumofArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum=0;
        System.out.println("Original array ");
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }
        System.out.println("\n Sum of the array :"+sum);

    }
}
