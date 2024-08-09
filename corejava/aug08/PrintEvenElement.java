package corejava.aug08;

public class PrintEvenElement {
    public static void main(String[] args) {
        //void printEven(int[]), method will print all even number from supplied array
        int[] array={12,24,54,9,89,10,5};
        System.out.println("Even element in a supplied array :");
        printEven(array);
    }
    public static void printEven(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ;");
            }
        }
    }
}
