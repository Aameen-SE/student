package corejava.aug04;

public class PrintOddNumberArray {
    public static void main(String[] args) {
        //wap to print only odd numbers from an array
        int[] arr= {1,2,3,4,5,6,78,65,78,97,45};

        System.out.println("Odd number from an array: ");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ; ");
            }
        }
    }
}
