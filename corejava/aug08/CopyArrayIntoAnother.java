package corejava.aug08;

public class CopyArrayIntoAnother {
    public static void main(String[] args) {
        //void copy(int[], int[]), copy first array to second array
        int[] array = {12, 24, 54, 9, 89, 10, 5};
        int[] array2 = new int[array.length];
        System.out.println("First Array :");
        copy(array,array2);
    }
    public static void copy(int[]arr1,int[]arr2){
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ;");

        }
        System.out.println("\n Second Array :");
        for(int i=0;i< arr1.length;i++){
            arr2[i]=arr1[i];
            System.out.print(arr2[i]+" ; ");
        }
    }
}
