package corejava.aug04;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("First Array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int[] arr2=new int[arr.length];
        System.out.println("\n Second Array copy of first array :");
        for(int i=0;i< arr.length;i++)
        {
            arr2[i]=arr[i];
            System.out.print(arr2[i]+" ");
        }
    }
}
