package corejava.aug11;

public class Program23 {
    public static void main(String[] args) {
        //wap to create and print array using loop
        int[] arr = {25 ,35 , 85};
        System.out.println("Printing array using for loop :");
        printArr(arr);
        System.out.println("\n Printing array using while loop : ");
        printArrUsingWhileLoop(arr);
    }
    public static void printArr(int[] arr){
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ; ");
        }
    }
    public static void printArrUsingWhileLoop(int[] arr){
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ; ");
            i++;
        }
    }
}
