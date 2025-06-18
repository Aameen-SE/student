package jva.arry;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr ={12,32,43,45,65,76,89,88,99};

        int evenCount=0;
        int oddCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Number of even element in array :  "+evenCount);
        System.out.println("Number of odd element in array :  "+oddCount);
    }
}
