package corejava.aug11;

public class Program25 {
    public static void main(String[] args) {
        //wap to print only odd numbers from an array
        int[] arr = {24 , 52 , 64 , 85 , 88 , 74 , 35 };
        System.out.println("Printing of Odd Array element :- ");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ; ");
            }
        }

        System.out.println("\nPrinting of Odd Array element using while loop :- ");
        printArr(arr);

    }
    public static void printArr(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ; ");
            }
            i++;
        }
    }

}
