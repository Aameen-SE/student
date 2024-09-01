package corejava.aug29;

public class ArryProgram2 {
    public static void main(String[] args) {
        int[] arr ={24 , 54 , 63 , 78 ,99,21,45};
        int[] arr1 ={24 , -54 , 63 , -78 ,99,-21,45};


        printArr(arr);
        printArr1(arr1);

        printOddArr(arr);
        printEvenArr(arr);

        printPositive(arr1);
        printNegative(arr1);
    }
    public static void printArr(int[] arr){
        System.out.println("Printing the given array which is used for even and odd num :");
        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"] : "+arr[i]+" ; ");
        }
        System.out.println();
    }
    public static void printArr1(int[] arr){
        System.out.println("\nPrinting the given array which is used for positive and negative num :");
        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"] : "+arr[i]+" ; ");
        }
        System.out.println();
    }
    //wap to print only odd numbers from an array
    public static void printOddArr(int[] ar){
        System.out.println("\nOdd Number From Array is printed  ");
        for(int i =0;i<ar.length;i++){
            if(ar[i]%2!=0){
                System.out.println(ar[i]);
            }
        }
    }
    //wap to print only even numbers from an array
    public static void printEvenArr(int[] ar){
        System.out.println("Even Number From Array is printed  ");
        for(int i =0;i<ar.length;i++){
            if(ar[i]%2==0){
                System.out.println(ar[i]);
            }
        }
    }

    //wap to print only positive number from an array
    public static void printPositive(int[] arr){
        System.out.println("Positive  Number From Array1 is printed  ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0)
            {
                System.out.println(arr[i]);
            }
        }

    }
   // wap to print only negative number from an array
    public static void printNegative(int[] arr){
        System.out.println("Negative  Number From Array1 is printed  ");
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0)
            {
                System.out.println(arr[i]);
            }
        }

    }




}
