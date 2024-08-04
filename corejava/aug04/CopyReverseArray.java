package corejava.aug04;

public class CopyReverseArray {
    public static void main(String[] args) {
        //wap to copy an array to another array in reverse order
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Original Array :");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n Copy of Array in reverse order :");
        int[] arr2=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            arr2[i]=arr[i];
            System.out.print(arr2[i]+" ");
        }
    }
}
