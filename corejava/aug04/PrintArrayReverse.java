package corejava.aug04;

public class PrintArrayReverse {
    public static void main(String[] args) {
        //wap to print array in reverse order
        int[] arr = {1,2,3,4,5,6};
        System.out.println(" Original Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n Array in reverse form :");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
