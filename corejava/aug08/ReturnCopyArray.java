package corejava.aug08;

public class ReturnCopyArray {
    public static void main(String[] args) {
        //int[] copy(int[]), create an array and copy supplied array and return that new array
        int[] array={12,34,54,67,89,90,65,};
        System.out.println("Supplied Array :");

        int[] newArray=copy(array);
        System.out.println(newArray);
    }
    public static int[] copy(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ;");
        }
        int i;
        for( i=0;i<arr.length;i++) {
            newArr[i] = arr[i];
            System.out.println("\n"+newArr[i]);
        }

        return newArr;

    }
}
