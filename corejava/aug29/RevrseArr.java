package corejava.aug29;

public class RevrseArr {
    public static void main(String[] args) {
        int[] arr={12,45,56,78,94,23};
        System.out.print("Given Array :");
        for(int i =0;i< arr.length;i++){
            System.out.print(" arr["+i+"] :"+arr[i]+" ; ");
        }
        System.out.println();

        System.out.print("\nPrinting array in reverse order :");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(" arr["+i+"] : "+arr[i]+" ; ");
        }
    }
}
