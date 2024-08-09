package corejava.aug08;

public class PrintOddElement {
    public static void main(String[] args) {
        int[] array={12,24,54,9,89,10,5};
        System.out.println("Odd Element in array :");
        printOdd(array);
    }
    public static void printOdd(int[] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ;");
            }
        }
    }
}
