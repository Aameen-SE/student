package corejava.aug08;

public class PrintPositiveElement {
    public static void main(String[] args) {
        //	2.	void printPositive(int[]), method will print all positive number from supplied array

        int[] array={-12,24,-54,-9,89,10,-5};
        System.out.println("Positive Element in array :");
        printPositive(array);
    }
    public  static void printPositive(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ; ");
            }
        }
    }
}
