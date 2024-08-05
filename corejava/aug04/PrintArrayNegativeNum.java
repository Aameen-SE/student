package corejava.aug04;

public class PrintArrayNegativeNum {
    public static void main(String[] args) {
        //wap to print only negative number from an array
     int[] arr ={1,3,4,56,-78,-12,87,78,95,-19,20};
        System.out.println("Negative number in array :");
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]<0)
             System.out.print(arr[i]+" , ");
     }
    }
}
