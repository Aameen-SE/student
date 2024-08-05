package corejava.aug04;

public class PrintEvenNumberArray {
    public static void main(String[] args) {
        int[] arr={12,2,4,5,6,8,9,7,18,17,15,14};

        System.out.println("Even Number in array :");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ; ");
        }
    }
}
