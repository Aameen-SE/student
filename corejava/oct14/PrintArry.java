package corejava.oct14;

public class PrintArry {
    public static void main(String[] args) {
        printArry();
        printArrUsingLoop();
        printArr();
    }
    public static void printArry(){
        //wap to create and print array using without loop
        int[] arr = {1,2,3,4};
        System.out.println("arr[1] :"+arr[1]);
        System.out.println("arr[2] :"+arr[2]);

    }
    public static void printArrUsingLoop(){
        System.out.println("Printing array using for loop : ");
        int[] arr = {1,2,3,4,5};
        for(int i=0;i< arr.length;i++){
            System.out.print("arr["+i+"] : "+arr[i]+" ;");
        }
    }

    public static void printArr(){
        System.out.println("\nPrinting array using for each loop");
        int[] arr = {1,2,3,4,5};
        for(int a :arr){
            System.out.print(a+" ; ");
        }
    }
}
